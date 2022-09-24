package org.koi.intellij.syntax.highlight

import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class KoiSyntaxHighlighterFactory : SyntaxHighlighterFactory() {
    override fun getSyntaxHighlighter(
            project: Project?, virtualFile: VirtualFile?
    ): SyntaxHighlighter = KoiSyntaxHighlighter()
}