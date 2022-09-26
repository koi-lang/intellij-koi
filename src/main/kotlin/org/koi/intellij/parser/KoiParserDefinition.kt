package org.koi.intellij.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory.createTokenSet
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode
import org.antlr.v4.runtime.Parser
import org.antlr.v4.runtime.tree.ParseTree
import org.koi.grammar.KoiLexer
import org.koi.grammar.KoiParser
import org.koi.intellij.KoiLanguage
import org.koi.intellij.KoiTokenTypes
import org.koi.intellij.psi.KoiPSIFileRoot
import org.koi.intellij.psi.node.KoiPSIBlockSubtree
import org.koi.intellij.psi.node.KoiPSICallSubtree
import org.koi.intellij.psi.subtree.KoiPSIClassSubtree
import org.koi.intellij.psi.subtree.KoiPSIFunctionSubtree
import org.koi.intellij.psi.subtree.KoiPSIImportSubtree
import org.koi.intellij.psi.subtree.KoiPSIVardefSubtree


class KoiParserDefinition : ParserDefinition {
    companion object {
        val FILE = IFileElementType(KoiLanguage)

        val NAME: TokenIElementType

        init {
            PSIElementTypeFactory.defineLanguageIElementTypes(
                KoiLanguage,
                KoiParser.tokenNames, KoiParser.ruleNames
            )

            NAME = KoiTokenTypes.getTokenElementType(KoiLexer.ID)
        }

        val COMMENTS: TokenSet = createTokenSet(
            KoiLanguage,
            KoiLexer.COMMENT,
            KoiLexer.MULTICOMMENT,
        )

        val WHITESPACE: TokenSet = createTokenSet(
            KoiLanguage,
            KoiLexer.WS,
            KoiLexer.SPACE,
        )

        val STRING: TokenSet = createTokenSet(
            KoiLanguage,
            KoiLexer.SINGLESTRING,
            KoiLexer.LITSTRING,
            KoiLexer.MULTISTRING,
        )
    }

    override fun createLexer(project: Project?): Lexer = ANTLRLexerAdaptor(
        KoiLanguage, KoiLexer(null)
    )

    override fun createParser(project: Project?): PsiParser =
        object : ANTLRParserAdaptor(
            KoiLanguage,
            KoiParser(null)
        ) {
            override fun parse(
                parser: Parser?,
                root: IElementType?
            ): ParseTree {
                val newParse = parser as KoiParser
                return if (root is IFileElementType) {
                    newParse.program()
                } else {
                    newParse.line()
                }
            }
        }

    override fun getWhitespaceTokens(): TokenSet = WHITESPACE
    override fun getCommentTokens(): TokenSet = COMMENTS
    override fun getStringLiteralElements(): TokenSet = STRING
    override fun getFileNodeType(): IFileElementType = FILE

    override fun spaceExistenceTypeBetweenTokens(
        left: ASTNode?, right: ASTNode?
    ): ParserDefinition.SpaceRequirements = ParserDefinition.SpaceRequirements.MAY

    override fun createFile(viewProvider: FileViewProvider): PsiFile =
        KoiPSIFileRoot(viewProvider)

    override fun createElement(node: ASTNode): PsiElement {
        val elType = node.elementType
        if (elType is TokenIElementType) {
            return ANTLRPsiNode(node)
        }
        if (elType !is RuleIElementType) {
            return ANTLRPsiNode(node)
        }

        return when (elType.ruleIndex) {
            KoiParser.RULE_function_block,
            KoiParser.RULE_procedure_block,
                // KoiParser.RULE_method_block
            -> KoiPSIFunctionSubtree(node, elType)

            KoiParser.RULE_class_block -> KoiPSIClassSubtree(node, elType)
            KoiParser.RULE_code_block,
            KoiParser.RULE_return_block,
            KoiParser.RULE_break_block,
            KoiParser.RULE_inner_class_block,
            KoiParser.RULE_when_block,
            KoiParser.RULE_is_block,
            KoiParser.RULE_when_else_block,
            KoiParser.RULE_enum_block,
            KoiParser.RULE_struct_block
            -> KoiPSIBlockSubtree(node)

            KoiParser.RULE_function_call,
            KoiParser.RULE_method_call
            -> KoiPSICallSubtree(node)

            KoiParser.RULE_local_asstmt -> KoiPSIVardefSubtree(node, elType)

            KoiParser.RULE_import_stmt -> KoiPSIImportSubtree(node, elType)
            else -> ANTLRPsiNode(node)
        }
    }
}