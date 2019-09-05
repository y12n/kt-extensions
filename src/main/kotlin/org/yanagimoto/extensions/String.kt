package org.yanagimoto.extensions

import java.net.URLDecoder
import java.net.URLEncoder
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.util.*

fun String.urlEncode(encoding: String = "UTF-8") = URLEncoder.encode(this, encoding)

fun String.urlDecode(encoding: String = "UTF-8") = URLDecoder.decode(this, encoding)

fun String.base64Encode() = Base64.getEncoder().encode(this.toByteArray())

fun String.base64Decode(encoding: Charset = StandardCharsets.UTF_8) = Base64.getDecoder().decode(this).toString(encoding)
