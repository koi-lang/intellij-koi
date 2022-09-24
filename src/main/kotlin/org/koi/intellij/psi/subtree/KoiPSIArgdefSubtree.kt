package org.koi.intellij.psi.subtree

import com.intellij.lang.ASTNode
import com.intellij.psi.tree.IElementType

class KoiPSIArgdefSubtree(node: ASTNode, idElementType: IElementType)
    : KoiPSIVardefSubtree(node, idElementType)