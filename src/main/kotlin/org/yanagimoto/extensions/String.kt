package org.yanagimoto.extensions

import java.net.URLDecoder
import java.net.URLEncoder

fun String.urlEncode(encoding: String = "UTF-8") = URLEncoder.encode(this, encoding)

fun String.urlDecode(encoding: String = "UTF-8") = URLDecoder.decode(this, encoding)
