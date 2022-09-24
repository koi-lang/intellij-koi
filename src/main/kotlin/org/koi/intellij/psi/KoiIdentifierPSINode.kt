package org.koi.intellij.psi

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.tree.IElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiLeafNode
import org.antlr.intellij.adaptor.psi.Trees
import org.koi.intellij.KoiLanguage
import org.koi.intellij.parser.KoiParserDefinition

class KoiIdentifierPSINode(type: IElementType, text: CharSequence) : ANTLRPsiLeafNode(type, text), PsiNamedElement {
    override fun setName(name: String): PsiElement {
        if (parent == null) return this

        Trees.createLeafFromText(
                project, KoiLanguage,
                context, name, KoiParserDefinition.NAME
        )

        return this
    }
}