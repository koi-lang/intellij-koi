package org.koilang.intellijkoi.lang.core.psi

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.antlr.jetbrains.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.jetbrains.adaptor.lexer.PSIElementTypeFactory
import org.antlr.jetbrains.adaptor.lexer.RuleIElementType
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType
import org.antlr.jetbrains.adaptor.parser.ANTLRParserAdaptor
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiNode
import org.antlr.v4.runtime.Parser
import org.antlr.v4.runtime.tree.ParseTree
import org.koilang.intellijkoi.KoiLexer
import org.koilang.intellijkoi.KoiParser
import org.koilang.intellijkoi.lang.KoiLanguage

class KoiParserDefinition : ParserDefinition {
    val FILE = IFileElementType(KoiLanguage)

    val tokenIElementTypes: List<TokenIElementType> = PSIElementTypeFactory.getTokenIElementTypes(KoiLanguage)

    val ID: TokenIElementType = tokenIElementTypes[KoiLexer.ID]

    init {
        PSIElementTypeFactory.defineLanguageIElementTypes(KoiLanguage, KoiParser.tokenNames, KoiParser.ruleNames)
    }

    val COMMENTS = PSIElementTypeFactory.createTokenSet(KoiLanguage, KoiLexer.COMMENT, KoiLexer.MULTICOMMENT)
    val WHITESPACE = PSIElementTypeFactory.createTokenSet(KoiLanguage, KoiLexer.WS)
    val STRING = PSIElementTypeFactory.createTokenSet(KoiLanguage, KoiLexer.LITSTRING, KoiLexer.SINGLESTRING, KoiLexer.MULTISTRING)

    override fun createLexer(project: Project?): Lexer {
        val lexer = KoiLexer(null)
        return ANTLRLexerAdaptor(KoiLanguage, lexer)
    }

    override fun createParser(project: Project?): PsiParser {
        val parser = KoiParser(null)
        return object : ANTLRParserAdaptor(KoiLanguage, parser) {
            override fun parse(parser: Parser?, root: IElementType?): ParseTree {
                return if (root is IFileElementType) {
                    (parser as KoiParser).program()
                } else (parser as KoiParser).statement()
            }
        }
    }

    override fun getWhitespaceTokens(): TokenSet {
        return WHITESPACE
    }

    override fun getCommentTokens(): TokenSet {
        return COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return STRING
    }

    override fun spaceExistanceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun createFile(viewProvider: FileViewProvider?): PsiFile {
        return KoiPsiFile(viewProvider!!)
    }

    override fun createElement(node: ASTNode?): PsiElement {
        val elType: IElementType = node!!.elementType

        if (elType is TokenIElementType) {
            return ANTLRPsiNode(node)
        }

        if (elType !is RuleIElementType) {
            return ANTLRPsiNode(node)
        }

        val ruleElType = elType as RuleIElementType

        return ANTLRPsiNode(node)
    }
}