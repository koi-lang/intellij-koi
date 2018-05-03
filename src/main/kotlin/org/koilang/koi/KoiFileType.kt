package org.koilang.koi

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object KoiFileType : LanguageFileType(KoiLanguage) {
    override fun getName(): String = "Koi file"

    override fun getDescription(): String = "Koi language file"

    override fun getDefaultExtension(): String = "kf"

    override fun getIcon(): Icon? = KoiIcons.KOI_FILE
}