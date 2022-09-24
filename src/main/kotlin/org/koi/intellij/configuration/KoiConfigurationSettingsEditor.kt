package org.koi.intellij.configuration

import com.intellij.openapi.options.SettingsEditor
import javax.swing.JComponent
import javax.swing.JPanel

class KoiConfigurationSettingsEditor : SettingsEditor<KoiRunConfiguration>() {
    val panel = JPanel()

    override fun resetEditorFrom(s: KoiRunConfiguration) {
    }

    override fun applyEditorTo(s: KoiRunConfiguration) {
    }

    override fun createEditor(): JComponent = panel
}