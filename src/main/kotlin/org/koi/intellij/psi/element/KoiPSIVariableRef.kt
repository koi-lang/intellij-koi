package org.koi.intellij.psi.element

import com.intellij.psi.PsiElement
import org.koi.intellij.psi.KoiIdentifierPSINode
import org.koi.intellij.psi.KoiPSIElementRef
import org.koi.intellij.psi.subtree.KoiPSIVardefSubtree

class KoiPSIVariableRef(element: KoiIdentifierPSINode) : KoiPSIElementRef(element) {
    override fun isDefSubtree(def: PsiElement?): Boolean = def is KoiPSIVardefSubtree
}