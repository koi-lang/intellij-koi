package org.koi.intellij.configuration

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.project.Project

class KoiConfigurationFactory(type: ConfigurationType) : ConfigurationFactory(type) {
    val FACTORY_NAME = "Koi configuration factory"

    override fun createTemplateConfiguration(project: Project): RunConfiguration =
            KoiRunConfiguration(project, this, "Koi")
}