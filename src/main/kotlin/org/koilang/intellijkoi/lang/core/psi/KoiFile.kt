package org.koilang.intellijkoi.lang.core.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.koilang.intellijkoi.lang.KoiFileType
import org.koilang.intellijkoi.lang.KoiLanguage
import javax.swing.Icon

class KoiFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, KoiLanguage) {
    override fun getFileType(): FileType = KoiFileType

    override fun toString(): String = "Koi File"

    override fun getIcon(flags: Int): Icon? = super.getIcon(flags)
}