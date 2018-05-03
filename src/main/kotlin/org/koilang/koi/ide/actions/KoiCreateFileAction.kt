package org.koilang.koi.ide.actions

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import org.koilang.koi.ide.icons.KoiIcons

class KoiCreateFileAction : CreateFileFromTemplateAction(CAPTION, "", KoiIcons.KOI_FILE), DumbAware {
    override fun getActionName(directory: PsiDirectory?, newName: String?, templateName: String?): String = CAPTION

    override fun buildDialog(project: Project?, directory: PsiDirectory?, builder: CreateFileFromTemplateDialog.Builder?) {
        builder!!.setTitle(CAPTION).addKind("Empty File", KoiIcons.KOI_FILE, "Koi File")
    }

    private companion object {
        private const val CAPTION = "New Koi File"
    }
}