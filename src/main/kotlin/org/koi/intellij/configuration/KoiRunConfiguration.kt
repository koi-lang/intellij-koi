package org.koi.intellij.configuration

import com.intellij.execution.Executor
import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.execution.configurations.RunConfigurationBase
import com.intellij.execution.configurations.RunProfileState
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project

class KoiRunConfiguration(
        project: Project,
        factory: ConfigurationFactory,
        name: String
) : RunConfigurationBase<Any>(project, factory, name) {
    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration> =
            KoiConfigurationSettingsEditor()

    override fun getState(
            executor: Executor,
            environment: ExecutionEnvironment
    ): RunProfileState? = null
}