package org.koi.intellij.facet

import com.intellij.facet.Facet
import com.intellij.facet.FacetType
import com.intellij.openapi.module.Module


class KoiFacet(
        facetType: FacetType<*, *>,
        module: Module,
        name: String,
        configuration: KoiFacetConfiguration,
        underlyingFacet: Facet<*>
) : Facet<KoiFacetConfiguration?>(
        facetType, module, name, configuration, underlyingFacet
)