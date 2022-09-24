package org.koi.intellij.ast

import com.intellij.lang.DefaultASTFactoryImpl
import com.intellij.psi.impl.source.tree.LeafElement
import com.intellij.psi.tree.IElementType
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import org.koi.grammar.KoiLexer
import org.koi.intellij.psi.KoiIdentifierPSINode

class KoiASTFactory : DefaultASTFactoryImpl() {
    override fun createLeaf(type: IElementType, text: CharSequence): LeafElement {
        return if (type is TokenIElementType &&
                type.antlrTokenType == KoiLexer.ID) {
            KoiIdentifierPSINode(type, text)
        } else {
            super.createLeaf(type, text)
        }
    }
}