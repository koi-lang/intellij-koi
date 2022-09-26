package org.koi.intellij.psi.subtree

import com.intellij.lang.ASTNode
import com.intellij.psi.tree.IElementType
import org.antlr.intellij.adaptor.psi.IdentifierDefSubtree

class KoiPSIImportSubtree(node: ASTNode, idElementType: IElementType)
    : IdentifierDefSubtree(node, idElementType)