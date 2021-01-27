package com.himanshu.customktx.extensions.view

import android.app.Activity
import android.view.View
import android.widget.TextView
import androidx.annotation.IdRes
import com.google.android.material.snackbar.Snackbar

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun Activity.findAndSetTextInTextView(@IdRes id: Int, text: String) {
    findViewById<TextView>(id).text = text
}

fun View.showTextInSnackbar(text: String) {
    Snackbar.make(this, text, Snackbar.LENGTH_LONG).show()
}

