package org.koi.intellij.facet

import com.intellij.facet.Facet
import com.intellij.facet.FacetType
import com.intellij.facet.FacetTypeId
import com.intellij.openapi.module.Module
import com.intellij.openapi.module.ModuleType
import org.koi.intellij.KoiIcons
import javax.swing.Icon

class KoiFacetType : FacetType<KoiFacet, KoiFacetConfiguration>(
        FACET_TYPE_ID, FACET_ID, FACET_NAME
) {
    companion object {
        const val FACET_ID = "KOI"
        const val FACET_NAME = "Koi"
        val FACET_TYPE_ID = FacetTypeId<KoiFacet>(this.FACET_ID)
    }

    override fun createDefaultConfiguration(): KoiFacetConfiguration =
            KoiFacetConfiguration()

    override fun createFacet(
        module: Module, name: String,
        configuration: KoiFacetConfiguration, underlyingFacet: Facet<*>?
    ): KoiFacet = KoiFacet(this, module, name, configuration, underlyingFacet!!)

    override fun isSuitableModuleType(moduleType: ModuleType<*>?): Boolean = true

    override fun getIcon(): Icon = KoiIcons.KOI
}