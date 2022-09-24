package org.koi.intellij.facet

import com.intellij.facet.ui.FacetEditorTab
import javax.swing.JComponent
import javax.swing.JPanel

class KoiFacetEditorTab : FacetEditorTab() {
    override fun getDisplayName(): String = KoiFacetType.FACET_NAME

    override fun createComponent(): JComponent = JPanel()

    override fun isModified(): Boolean = true
}