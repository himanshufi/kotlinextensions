package com.himanshu.customktx.extensions.context

import android.content.Context
import android.widget.Toast

/**
 * Toast extensions.
 */

fun Context.showSmallLengthToast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}

fun Context.showLongLengthToast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}