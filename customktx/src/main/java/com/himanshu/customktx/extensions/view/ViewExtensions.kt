package com.himanshu.customktx.extensions.view

import android.view.View
import com.google.android.material.snackbar.Snackbar

/**
 * General views extensions.
 */

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

/**
 * Snackbar extensions.
 */

fun View.showSmallSnackbar(text: String) {
    Snackbar.make(this, text, Snackbar.LENGTH_SHORT).show()
}

fun View.showLongSnackbar(text: String) {
    Snackbar.make(this, text, Snackbar.LENGTH_LONG).show()
}

fun View.showIndefiniteSnackbar(text: String) {
    Snackbar.make(this, text, Snackbar.LENGTH_INDEFINITE).show()
}

