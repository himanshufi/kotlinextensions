package com.himanshu.customktx.extensions.activity

import android.app.Activity
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.IdRes

/**
 * Extensions used on views using ResId.
 */

fun Activity.findAndSetTextInTextView(@IdRes id: Int, text: String) {
    findViewById<TextView>(id).text = text
}

fun Activity.findAndSetTextInEditText(@IdRes id: Int, text: String) {
    findViewById<EditText>(id).setText(text)
}