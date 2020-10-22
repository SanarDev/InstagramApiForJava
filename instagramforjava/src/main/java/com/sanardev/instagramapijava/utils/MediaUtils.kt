package com.sanardev.instagramapijava.utils

import android.content.Context
import android.graphics.BitmapFactory
import android.media.MediaMetadataRetriever
import android.net.Uri
import android.webkit.MimeTypeMap
import java.io.File
import java.io.FileInputStream
import java.io.InputStream

class MediaUtils {

    companion object{

        @JvmStatic
        fun getFileByteArray(file: File): ByteArray {
            val `in`: InputStream = FileInputStream(file)
            val buf = ByteArray(`in`.available())
            while (`in`.read(buf) != -1);
            return buf
        }
        @JvmStatic
        fun getFileByteArray(filePath:String): ByteArray {
            val `in`: InputStream = FileInputStream(File(filePath))
            val buf = ByteArray(`in`.available())
            while (`in`.read(buf) != -1);
            return buf
        }

        @JvmStatic
        fun getMimeType(filePath: String): String {
            var type: String? = null
            val extension = MimeTypeMap.getFileExtensionFromUrl(filePath)
            if (extension != null) {
                type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension)
            }
            if(type == null){
                type = "image/jpeg"
            }
            return type
        }

        @JvmStatic
        fun getMediaDuration(context: Context?, filePath: String?): Int {
            val uri = Uri.parse(filePath)
            val mmr = MediaMetadataRetriever()
            mmr.setDataSource(context, uri)
            val durationStr =
                mmr.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION)
            return durationStr.toInt()
        }

        @JvmStatic
        fun getMediaWidthAndHeight(filePath: String): IntArray {
            val mimeType = getMimeType(filePath) ?: "image/jpeg"
            if (mimeType.contains("image")) {
                val options = BitmapFactory.Options()
                options.inJustDecodeBounds = true
                BitmapFactory.decodeFile(filePath)
                val imageHeight = options.outHeight
                val imageWidth = options.outWidth
                return intArrayOf(imageWidth, imageHeight)
            } else {
                val retriever = MediaMetadataRetriever()
                retriever.setDataSource(filePath)
                val width =
                    retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_VIDEO_WIDTH)
                        .toInt()
                val height =
                    retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_VIDEO_HEIGHT)
                        .toInt()
                retriever.release()
                return intArrayOf(width, height)
            }
        }
    }
}