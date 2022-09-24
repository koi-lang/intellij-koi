package org.koi.intellij.facet

import com.intellij.facet.FacetConfiguration
import com.intellij.facet.ui.FacetEditorContext
import com.intellij.facet.ui.FacetEditorTab
import com.intellij.facet.ui.FacetValidatorsManager
import com.intellij.openapi.components.PersistentStateComponent

class KoiFacetConfiguration : FacetConfiguration, PersistentStateComponent<KoiFacetState> {
    var facetState = KoiFacetState()

    override fun createEditorTabs(
            editorContext: FacetEditorContext?,
            validatorsManager: FacetValidatorsManager?
    ): Array<FacetEditorTab> = arrayOf(KoiFacetEditorTab())

    override fun getState(): KoiFacetState = this.facetState

    override fun loadState(state: KoiFacetState) {
        this.facetState = state
    }
}