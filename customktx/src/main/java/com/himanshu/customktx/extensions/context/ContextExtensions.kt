package com.himanshu.customktx.extensions.context

import android.content.Context
import android.widget.Toast

/**
 * Toast extensions.
 */
fun Context.showSmallLengthToast(text: String) {
    showToast(text, Toast.LENGTH_SHORT)
}

fun Context.showLongLengthToast(text: String) {
    showToast(text, Toast.LENGTH_LONG)
}

private fun Context.showToast(text:String, duration: Int) {
    Toast.makeText(this, text, duration).show()
}