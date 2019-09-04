package org.yanagimoto.extensions

import java.net.URLEncoder

fun String.urlEncode(encoding: String = "UTF-8"): String {
  return URLEncoder.encode(this, encoding)
}
