package org.koi.intellij.configuration

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import org.koi.intellij.KoiIcons
import javax.swing.Icon

class KoiRunConfigurationType : ConfigurationType {
    override fun getDisplayName(): String = "Koi"
    override fun getConfigurationTypeDescription(): String = "Koi Run Configuration Type"
    override fun getIcon(): Icon = KoiIcons.KOI
    override fun getId(): String = "KOI_RUN_CONFIGURATION"
    override fun getConfigurationFactories(): Array<ConfigurationFactory> =
            arrayOf(KoiConfigurationFactory(this))
}