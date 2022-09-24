package org.koi.intellij.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import org.antlr.intellij.adaptor.SymtabUtils
import org.antlr.intellij.adaptor.psi.ScopeNode
import org.koi.intellij.KoiIcons
import org.koi.intellij.KoiLanguage
import org.koi.intellij.file.KoiFileType
import org.koi.intellij.psi.node.KoiPSICallSubtree
import javax.swing.Icon

class KoiPSIFileRoot(viewProvider: FileViewProvider) : PsiFileBase(
        viewProvider, KoiLanguage
), ScopeNode {
    override fun getFileType(): FileType = KoiFileType
    override fun getIcon(flags: Int): Icon = KoiIcons.KOI

    override fun getContext(): ScopeNode? = null

    override fun resolve(element: PsiNamedElement): PsiElement? {
        return if (element.parent is KoiPSICallSubtree) {
            SymtabUtils.resolve(
                    this, KoiLanguage,
                    element, "/script/function/ID"
            )
        } else {
            SymtabUtils.resolve(
                    this, KoiLanguage,
                    element, "/script/vardef/ID"
            )
        }
    }

    override fun toString(): String = "Koi Language"
}