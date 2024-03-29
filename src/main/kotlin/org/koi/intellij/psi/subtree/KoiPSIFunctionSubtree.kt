package org.koi.intellij.psi.subtree

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.tree.IElementType
import org.antlr.intellij.adaptor.SymtabUtils
import org.antlr.intellij.adaptor.psi.IdentifierDefSubtree
import org.antlr.intellij.adaptor.psi.ScopeNode
import org.koi.intellij.KoiLanguage

class KoiPSIFunctionSubtree(node: ASTNode, idElementType: IElementType)
    : IdentifierDefSubtree(node, idElementType), ScopeNode {
    override fun resolve(element: PsiNamedElement): PsiElement? =
            SymtabUtils.resolve(
                    this, KoiLanguage,
                    element, "/script/function/ID"
            )
}