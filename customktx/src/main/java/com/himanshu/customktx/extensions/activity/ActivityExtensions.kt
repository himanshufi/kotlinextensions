package com.himanshu.customktx.extensions.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

/**
 * Extensions used on views using ResId.
 */
fun Activity.findAndSetTextInTextView(@IdRes id: Int, text: String) {
    findViewById<TextView>(id).text = text
}

fun Activity.findAndSetTextInEditText(@IdRes id: Int, text: String) {
    findViewById<EditText>(id).setText(text)
}

/**
 * Explicit Intent Extensions.
 */

/**
 * `shouldGoTo` is used to
 * start an intent without any
 * extra Bundle().
 */
inline fun <reified T> Activity.shouldGoTo() {
    makeAnIntent<T>()
}

/**
 * `shouldFinishAndGoTo()` finishes the existing
 * `Activity` after the intent is fired.
 */
inline fun <reified T> Activity.shouldFinishAndGoTo() {
    makeAnIntent<T>()
    finishItOff()
}

/**
 * `shouldGoWithDataTo` is used to
 * fire an intent with a
 * Bundle().
 */
inline fun <reified T> Activity.shouldGoWithDataTo(key:String, bundle: Bundle) {
    makeAnIntent<T>(key, bundle)
}

/**
 * `shouldFinishAndGoWithDataTo` is used to
 * finish the existing `Activity` after an
 * intent is fired with `Bundle`.
 */
inline fun <reified T> Activity.shouldFinishAndGoWithDataTo(key:String, bundle: Bundle) {
    makeAnIntent<T>(key, bundle)
    finishItOff()
}

/**
 * Creates an intent with an `Activity`.
 */
inline fun <reified T> Activity.makeAnIntent(key:String? = null, bundle: Bundle? = null) {
    val intent = Intent(this, T::class.java)
    intent.putExtra(key, bundle)
    startActivity(intent)
}

/**
 * Finishes an `Activity`.
 */
fun Activity.finishItOff() {
    finish()
}