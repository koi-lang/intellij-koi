package org.koilang.koi

import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory

class KoiFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(comsumer: FileTypeConsumer) {
        comsumer.consume(KoiFileType)
    }
}