package org.koi.intellij.folding

import com.intellij.lang.ASTNode
import com.intellij.lang.folding.CustomFoldingBuilder
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.editor.Document
import com.intellij.openapi.editor.FoldingGroup
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.SourceTreeToPsiMap
import com.intellij.psi.util.PsiTreeUtil
import org.koi.intellij.psi.KoiPSIFileRoot
import org.koi.intellij.psi.node.KoiPSIBlockSubtree

class KoiFoldingBuilder : CustomFoldingBuilder() {
    val blockGroup: FoldingGroup = FoldingGroup.newGroup("block")

    override fun buildLanguageFoldRegions(
            descriptors: MutableList<FoldingDescriptor>,
            root: PsiElement,
            document: Document,
            quick: Boolean
    ) {
        if (root !is KoiPSIFileRoot) return

        addBlockFoldingDescriptor(descriptors, root)
    }

    override fun isRegionCollapsedByDefault(node: ASTNode): Boolean = true

    override fun getLanguagePlaceholderText(node: ASTNode, range: TextRange): String =
        when (SourceTreeToPsiMap.treeElementToPsi(node)) {
            else -> "..."
        }

    private fun addBlockFoldingDescriptor(
            descriptors: MutableList<FoldingDescriptor>,
            root: PsiElement
    ) {
        val expressions = PsiTreeUtil.findChildrenOfType(root, KoiPSIBlockSubtree::class.java)
        for (expr in expressions) {
            descriptors.add(FoldingDescriptor(
                    expr.node,
                    TextRange(
                            expr.textRange.startOffset + 1,
                            expr.textRange.endOffset - 1
                    ),
                    blockGroup
            ))
        }
    }
}