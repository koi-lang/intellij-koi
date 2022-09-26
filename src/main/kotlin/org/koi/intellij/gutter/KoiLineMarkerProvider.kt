package org.koi.intellij.gutter

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.LineMarkerProvider
import com.intellij.icons.AllIcons
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.psi.PsiElement
import org.koi.intellij.psi.subtree.KoiPSIClassSubtree
import org.koi.intellij.psi.subtree.KoiPSIFunctionSubtree
import org.koi.intellij.psi.subtree.KoiPSIImportSubtree
import org.koi.intellij.psi.subtree.KoiPSIVardefSubtree

class KoiLineMarkerProvider : LineMarkerProvider {
    override fun getLineMarkerInfo(element: PsiElement): LineMarkerInfo<*>? =
        when (element) {
            is KoiPSIVardefSubtree ->
                LineMarkerInfo(
                    element,
                    element.textRange,
                    AllIcons.Nodes.Variable,
                    { "Defines variable ${element.text}" },
                    null,
                    GutterIconRenderer.Alignment.RIGHT
                )

            is KoiPSIImportSubtree ->
                LineMarkerInfo(
                    element,
                    element.textRange,
                    AllIcons.Nodes.Include,
                    { "Imports identifier ${element.text}" },
                    null,
                    GutterIconRenderer.Alignment.RIGHT
                )

            is KoiPSIClassSubtree ->
                LineMarkerInfo(
                    element,
                    element.textRange,
                    AllIcons.Nodes.Class,
                    { "Defines class '${element.text}'" },
                    null,
                    GutterIconRenderer.Alignment.RIGHT
                )

            is KoiPSIFunctionSubtree ->
                LineMarkerInfo(
                    element,
                    element.textRange,
                    AllIcons.Nodes.Function,
                    { "Defines function '${element.text}'" },
                    null,
                    GutterIconRenderer.Alignment.RIGHT
                )

            else -> null
        }
}