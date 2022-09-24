package org.koi.intellij.file

import com.intellij.openapi.fileTypes.LanguageFileType
import org.koi.intellij.KoiIcons
import org.koi.intellij.KoiLanguage
import javax.swing.Icon

object KoiFileType : LanguageFileType(KoiLanguage) {
    override fun getName(): String = "Koi"
    override fun getDescription(): String = "Koi language"
    override fun getDefaultExtension(): String = "koi"
    override fun getIcon(): Icon = KoiIcons.KOI
}