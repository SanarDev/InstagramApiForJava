package com.sanardev.instagramapijava.utils

import com.sanardev.instagramapijava.IGConstants
import org.apache.commons.codec.binary.Base64
import java.io.ByteArrayOutputStream
import java.io.UnsupportedEncodingException
import java.net.URLEncoder
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.charset.StandardCharsets
import java.security.*
import java.security.spec.X509EncodedKeySpec
import java.util.*
import javax.crypto.Cipher
import javax.crypto.Mac
import javax.crypto.spec.GCMParameterSpec
import javax.crypto.spec.SecretKeySpec

class InstaHashUtils {

    companion object{

        private const val XLATE = "0123456789abcdef"
        private val HEX_ARRAY = "0123456789ABCDEF".toCharArray()

        protected fun hexlate(bytes: ByteArray, initialCount: Int): String {
            if (bytes == null) {
                return ""
            }
            val count = Math.min(initialCount, bytes.size)
            val chars = CharArray(count * 2)
            for (i in 0 until count) {
                var value = bytes[i].toInt()
                if (value < 0) {
                    value += 256
                }
                chars[(2 * i)] = XLATE.get(value / 16)
                chars[(2 * i + 1)] = XLATE.get(value % 16)
            }
            return String(chars)
        }

        fun generateHash(key: String, string: String): String? {
            val `object` = SecretKeySpec(key.toByteArray(), "HmacSHA256")
            try {
                val mac = Mac.getInstance("HmacSHA256")
                mac.init(`object` as Key)
                val byteArray = mac.doFinal(string.toByteArray(charset("UTF-8")))
                return byteArray.joinToString("") { "%02x".format(it) }
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return null
        }

        @JvmStatic
        fun encryptPassword(
            password: String,
            enc_id: String?,
            enc_pub_key: String?
        ): String? {
            val rand_key = ByteArray(32)
            val iv = ByteArray(12)
            val sran = SecureRandom()
            sran.nextBytes(rand_key)
            sran.nextBytes(iv)
            val time = (System.currentTimeMillis() / 1000).toString()

            // Encrypt random key
            val decoded_pub_key = String(
                Base64.decodeBase64(enc_pub_key),
                StandardCharsets.UTF_8
            ).replace("-----BEGIN PUBLIC KEY-----", "").replace("\n-----END PUBLIC KEY-----", "")
            val rsa_cipher: Cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING")
            rsa_cipher.init(
                Cipher.ENCRYPT_MODE,
                KeyFactory.getInstance("RSA")
                    .generatePublic(X509EncodedKeySpec(Base64.decodeBase64(decoded_pub_key)))
            )
            val rand_key_encrypted: ByteArray = rsa_cipher.doFinal(rand_key)

            // Encrypt password
            val aes_gcm_cipher: Cipher = Cipher.getInstance("AES/GCM/NoPadding")
            aes_gcm_cipher.init(
                Cipher.ENCRYPT_MODE,
                SecretKeySpec(rand_key, "AES"),
                GCMParameterSpec(128, iv)
            )
            aes_gcm_cipher.updateAAD(time.toByteArray())
            val password_encrypted: ByteArray =
                aes_gcm_cipher.doFinal(password.toByteArray())

            // Write to final byte array
            val out = ByteArrayOutputStream()
            out.write(ByteBuffer.allocate(Int.SIZE_BYTES).putInt(1).array())
            out.write(ByteBuffer.allocate(Int.SIZE_BYTES).putInt(enc_id!!.toInt()).array())
            out.write(iv)
            out.write(
                ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN)
                    .putChar(rand_key_encrypted.size.toChar()).array()
            )
            out.write(rand_key_encrypted)
            out.write(
                Arrays.copyOfRange(
                    password_encrypted,
                    password_encrypted.size - 16,
                    password_encrypted.size
                )
            )
            out.write(Arrays.copyOfRange(password_encrypted, 0, password_encrypted.size - 16))
            return java.lang.String.format(
                "#PWD_INSTAGRAM:%s:%s:%s",
                "4",
                time,
                Base64.encodeBase64String(out.toByteArray())
            )
        }


        @JvmStatic
        fun getClientContext(): String {
            var rnd = Random();
            var str = "";
            // 6600286272511816379
            str += rnd.nextInt(9);
            str += rnd.nextInt(9);
            str += rnd.nextInt(9);
            //str += Rnd.Next(11, 99);
            str += (Math.random() * (9999 - 1000 + 1) + 1000).toInt()
            str += (Math.random() * (99999 - 11111 + 1) + 11111).toInt()

            str += (Math.random() * (6789 - 2222 + 1) + 2222).toInt()
            return "668${str}";
        }

        @JvmStatic
        fun generatePacketID(): Int {
            return Random().nextInt(65535)
        }

        @JvmStatic
        fun getUploadId(story: Boolean = false): String {
            var r = if (story) "18" else "16"
            for (i in 0..13) {
                r += (Math.random() * (9 + 1) + 0).toInt().toString()
            }
            return r
        }

        @JvmStatic
        fun getRetryContext(): HashMap<String, *>? {
            val retryContext: HashMap<String, *> =
                HashMap<String, Any>().apply {
                    this["num_reupload"] = 0
                    this["num_step_auto_retry"] = 0
                    this["num_step_manual_retry"] = 0
                }
            return retryContext
        }
        @JvmStatic
        fun generateSignature(payload: String): String {
            val parsedData = URLEncoder.encode(payload, "UTF-8")
            val signedBody = generateHash(IGConstants.API_KEY, payload)
            return StringBuilder()
                .append("ig_sig_key_version=")
                .append(IGConstants.API_SIGN_KEY_VERSION)
                .append("&signed_body=")
                .append(signedBody)
                .append(".")
                .append(parsedData)
                .toString()
        }

        @JvmStatic
        fun urlEncodeUTF8(map: Map<*, *>): String? {
            val sb = StringBuilder()
            for (entry in map.entries) {
                if (sb.length > 0) {
                    sb.append("&")
                }
                sb.append(
                    String.format(
                        "%s=%s",
                        urlEncodeUTF8(entry.key.toString()),
                        urlEncodeUTF8(entry.value.toString())
                    )
                )
            }
            return sb.toString()
        }
        fun urlEncodeUTF8(s: String?): String? {
            return try {
                URLEncoder.encode(s, "UTF-8")
            } catch (e: UnsupportedEncodingException) {
                throw UnsupportedOperationException(e)
            }
        }

        protected fun digest(codec: String, source: String): String {
            try {
                val digest = MessageDigest.getInstance(codec)
                val digestBytes = digest.digest(source.toByteArray())
                return hexlate(digestBytes, digestBytes.size)
            } catch (nsae: NoSuchAlgorithmException) {
                throw RuntimeException(codec + " codec not available")
            }
        }

        fun md5hex(source: String): String {
            return digest("MD5", source)
        }

        @JvmStatic
        fun generateDeviceId(username: String, password: String): String {
            val seed = md5hex(username + password)
            val volatileSeed = "12345"
            return "android-" + md5hex(seed + volatileSeed).substring(0, 16)
        }
    }
}