package org.koi.intellij.syntax.highlight

import org.koi.grammar.KoiLexer
import org.koi.grammar.KoiParser
import org.koi.intellij.KoiLanguage
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.TokenIElementType

class KoiSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val EMPTY_KEYS = emptyArray<TextAttributesKey>()

        val NAME = createTextAttributesKey(
            "KOI_ID", DefaultLanguageHighlighterColors.IDENTIFIER
        )

        val KEYWORD = createTextAttributesKey(
            "KOI_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD
        )

        val STRING = createTextAttributesKey(
            "KOI_STRING", DefaultLanguageHighlighterColors.STRING
        )

        val NUMBER = createTextAttributesKey(
            "KOI_NUMBER", DefaultLanguageHighlighterColors.NUMBER
        )

        val CLASS_NAME = createTextAttributesKey(
            "KOI_CLASS_NAME", DefaultLanguageHighlighterColors.CLASS_NAME
        )

        val LINE_COMMENT = createTextAttributesKey(
            "KOI_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT
        )

        val BLOCK_COMMENT = createTextAttributesKey(
            "KOI_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT
        )

        val SEMI_COLON = createTextAttributesKey(
            "KOI_SEMI_COLON", DefaultLanguageHighlighterColors.SEMICOLON
        )

        val DOT = createTextAttributesKey(
            "KOI_DOT", DefaultLanguageHighlighterColors.DOT
        )

        val ESCAPE = createTextAttributesKey(
            "KOI_ESCAPE", DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE
        )

        val PARENTHESES = createTextAttributesKey(
            "KOI_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES
        )

        val OPERATION = createTextAttributesKey(
            "KOI_OPERATION", DefaultLanguageHighlighterColors.OPERATION_SIGN
        )

        // Sets of symbols

        val PREDEFINED = createTextAttributesKey(
            "KOI_PREDEFINED", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL
        )

        val BRACES = createTextAttributesKey(
            "KOI_BRACE", DefaultLanguageHighlighterColors.BRACES
        )

        val BRACKETS = createTextAttributesKey(
            "KOI_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS
        )

        // Parser

        val PARAMETER = createTextAttributesKey(
            "KOI_PARAMETER", DefaultLanguageHighlighterColors.PARAMETER
        )

        init {
            PSIElementTypeFactory.defineLanguageIElementTypes(
                KoiLanguage,
                KoiParser.tokenNames, KoiParser.ruleNames
            )
        }
    }

    override fun getHighlightingLexer(): Lexer =
        ANTLRLexerAdaptor(KoiLanguage, KoiLexer(null))

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        if (tokenType !is TokenIElementType) return EMPTY_KEYS

        return arrayOf(
            when (tokenType.antlrTokenType) {
                KoiLexer.DOT, KoiLexer.TRIPLE_DOT -> DOT

                KoiLexer.QUESTION, KoiLexer.EXCLAMATION,
                KoiLexer.CORE, KoiLexer.STANDARD, KoiLexer.LOCAL -> PREDEFINED

                KoiLexer.OBJ,
                KoiLexer.CHAR, KoiLexer.STR,
                KoiLexer.INT, KoiLexer.FLO, KoiLexer.DOU,
                KoiLexer.BOOL,
                KoiLexer.NONE -> CLASS_NAME

                KoiLexer.EQUALS,
                KoiLexer.ADD,
                KoiLexer.SUB,
                KoiLexer.MUL,
                KoiLexer.DIV,
                -> OPERATION

                KoiLexer.OPEN_BRACE, KoiLexer.CLOSE_BRACE -> BRACES
                KoiLexer.OPEN_PARENTHESIS, KoiLexer.CLOSE_PARENTHESIS -> PARENTHESES
                KoiLexer.OPEN_BRACKET, KoiLexer.CLOSE_BRACKET -> BRACKETS

                KoiLexer.VAR,
                KoiLexer.NEW, KoiLexer.CALL,
                KoiLexer.IMPORT,
                KoiLexer.RETURN,
                KoiLexer.ENUM, KoiLexer.STRUCT,
                KoiLexer.FOR, KoiLexer.IN,
                KoiLexer.IF, KoiLexer.ELF, KoiLexer.ELSE,
                KoiLexer.WHEN, KoiLexer.IS,
                KoiLexer.FUNCTION, KoiLexer.PROCEDURE,
                KoiLexer.METH,
                KoiLexer.CLASS,
                KoiLexer.CONSTRUCTOR, KoiLexer.INIT,
                -> KEYWORD

                KoiLexer.SEMICOLON -> SEMI_COLON

                KoiLexer.SINGLESTRING, KoiLexer.LITSTRING, KoiLexer.MULTISTRING -> STRING

                KoiLexer.INTEGER, KoiLexer.FLOAT, KoiLexer.DECIMAL -> NUMBER

                KoiLexer.COMMENT -> LINE_COMMENT
                KoiLexer.MULTICOMMENT -> BLOCK_COMMENT

                KoiLexer.ID, KoiLexer.TEMP_ID -> NAME

                else -> return EMPTY_KEYS
            }
        )
    }
}