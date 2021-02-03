package com.himanshu.customktx.extensions.view

import android.view.View
import com.google.android.material.snackbar.Snackbar

/**
 * View's visibility extensions.
 */

fun View.visible() {
    changeViewVisibility(View.VISIBLE)
}

fun View.gone() {
    changeViewVisibility(View.GONE)
}

fun View.invisible() {
    changeViewVisibility(View.INVISIBLE)
}

private fun View.changeViewVisibility(newState: Int) {
    visibility = newState
}

/**
 * Snackbar's extensions.
 */

fun View.showSmallSnackbar(text: String) {
    showSnackbar(text, Snackbar.LENGTH_SHORT)
}

fun View.showLongSnackbar(text: String) {
    showSnackbar(text, Snackbar.LENGTH_LONG)
}

fun View.showIndefiniteSnackbar(text: String) {
    showSnackbar(text, Snackbar.LENGTH_INDEFINITE)
}

private fun View.showSnackbar(text: String, duration: Int) {
    Snackbar.make(this, text, duration).show()
}
