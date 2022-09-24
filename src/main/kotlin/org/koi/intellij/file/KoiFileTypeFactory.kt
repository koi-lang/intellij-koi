package org.koi.intellij.file

import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory

class KoiFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(consumer: FileTypeConsumer): Unit =
            consumer.consume(KoiFileType, KoiFileType.defaultExtension)
}