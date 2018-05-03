package org.koilang.koi.lang

import com.intellij.openapi.fileTypes.LanguageFileType
import org.koilang.koi.ide.icons.KoiIcons
import javax.swing.Icon

object KoiFileType : LanguageFileType(KoiLanguage) {
    override fun getName(): String = "Koi file"

    override fun getDescription(): String = "Koi language file"

    override fun getDefaultExtension(): String = "kf"

    override fun getIcon(): Icon? = KoiIcons.KOI_FILE
}