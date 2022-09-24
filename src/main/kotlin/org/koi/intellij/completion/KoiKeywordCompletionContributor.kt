package org.koi.intellij.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext
import org.koi.intellij.KoiLanguage

class KoiKeywordCompletionContributor : CompletionContributor() {
    init {
        // General keywords
        extend(
                CompletionType.BASIC,
                PlatformPatterns
                        // It won't let me use a specific element like ConcurnasParser#RULE_code
                        .psiElement()
                        .withLanguage(KoiLanguage),
                object : CompletionProvider<CompletionParameters>() {
                    override fun addCompletions(
                            parameters: CompletionParameters,
                            context: ProcessingContext,
                            result: CompletionResultSet
                    ) {
                        result.addAllElements(
                                listOf(
                                        LookupElementBuilder.create("class"),
                                        LookupElementBuilder.create("fun")
                                )
                        )
                    }
                }
        )
    }
}