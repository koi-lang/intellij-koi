package org.koilang.intellijkoi.lang

import com.intellij.openapi.fileTypes.LanguageFileType
import org.koilang.intellijkoi.ide.KoiExtensions
import org.koilang.intellijkoi.ide.icons.KoiIcons
import javax.swing.Icon

object KoiFileType : LanguageFileType(KoiLanguage) {
    override fun getName(): String = "Koi file"

    override fun getDescription(): String = "Koi language file"

    override fun getDefaultExtension(): String = KoiExtensions.KOI_FILE

    override fun getIcon(): Icon? = KoiIcons.KOI_FILE
}