package org.koi.intellij.matcher

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import org.koi.grammar.KoiLexer
import org.koi.intellij.KoiTokenTypes

class KoiBraceMatcher : PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> = arrayOf(
            // Parenthesis
            BracePair(
                    KoiTokenTypes.getTokenElementType(KoiLexer.OPEN_PARENTHESIS),
                    KoiTokenTypes.getTokenElementType(KoiLexer.CLOSE_PARENTHESIS),
                    false
            ),
            // Square brackets
            BracePair(
                    KoiTokenTypes.getTokenElementType(KoiLexer.OPEN_BRACKET),
                    KoiTokenTypes.getTokenElementType(KoiLexer.CLOSE_BRACKET),
                    false
            ),
            // Curly braces
            BracePair(
                    KoiTokenTypes.getTokenElementType(KoiLexer.OPEN_BRACE),
                    KoiTokenTypes.getTokenElementType(KoiLexer.CLOSE_BRACE),
                    true
            )
    )

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?): Boolean = true
    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset
}