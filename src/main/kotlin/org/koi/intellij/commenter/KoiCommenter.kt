package org.koi.intellij.commenter

import com.intellij.lang.Commenter

class KoiCommenter : Commenter {
    override fun getCommentedBlockCommentPrefix(): String = "#--"
    override fun getCommentedBlockCommentSuffix(): String = "--#"

    override fun getBlockCommentPrefix(): String = "#-"
    override fun getBlockCommentSuffix(): String = "-#"

    override fun getLineCommentPrefix(): String = "#"
}