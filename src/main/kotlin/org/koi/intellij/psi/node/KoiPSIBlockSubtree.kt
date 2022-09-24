package org.koi.intellij.psi.node

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import org.antlr.intellij.adaptor.SymtabUtils
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode
import org.antlr.intellij.adaptor.psi.ScopeNode
import org.koi.intellij.KoiLanguage


class KoiPSIBlockSubtree(node: ASTNode) : ANTLRPsiNode(node), ScopeNode {
    override fun resolve(element: PsiNamedElement?): PsiElement? =
            SymtabUtils.resolve(
                    this, KoiLanguage,
                element, "/block/vardef/ID"
            )
}