package com.himanshu.customktx.extensions.general

import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat

/**
 * General extensions for ArrayList.
 */
fun <T: Any> ArrayList<T>.replaceItemInList(item: T): ArrayList<T> {
    if(this.contains(item)) this.remove(item) else this.add(item)
    return this
}

fun <T: Any> ArrayList<T>.refreshList(items: List<T>): ArrayList<T> {
    this.clear()
    this.addAll(items)
    return this
}

fun <T: Any> ArrayList<T>.addOnlyNewItemInList(items: List<T>): ArrayList<T> {
    items.forEach { if(!this.contains(it)) this.add(it)  }
    return this
}

/**
 * General extensions for MutableList.
 */

fun <T: Any> MutableList<T>.replaceItemInList(item: T): MutableList<T> {
    if(this.contains(item)) this.remove(item) else this.add(item)
    return this
}

fun <T: Any> MutableList<T>.refreshList(items: List<T>): MutableList<T> {
    this.clear()
    this.addAll(items)
    return this
}

fun <T: Any> MutableList<T>.addOnlyNewItemInList(items: List<T>): MutableList<T> {
    items.forEach { if(!this.contains(it)) this.add(it)  }
    return this
}

/**
 * General extensions for an Activity.
 */

fun Activity.hasPermission(permission: String): Boolean {
    return ActivityCompat.checkSelfPermission(
        this,
        permission
    ) == PackageManager.PERMISSION_GRANTED
}