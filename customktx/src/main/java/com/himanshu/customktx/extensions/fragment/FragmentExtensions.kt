package com.himanshu.customktx.extensions.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

/**
 * To add a fragment using `commitNow()`.
 */
inline fun < reified T: Fragment> FragmentActivity.addFragmentNow(id: Int) {
    val fragment = T::class.java
    supportFragmentManager.beginTransaction().add(id, fragment.newInstance()).commitNow()
}

/**
 * To replace a fragment using `commitNow()`.
 */
inline fun < reified T: Fragment> FragmentActivity.replaceFragmentNow(id: Int) {
    val fragment = T::class.java
    supportFragmentManager.beginTransaction().replace(id, fragment.newInstance()).commitNow()
}

/**
 * To add a fragment using `commit()`.
 */
inline fun < reified T: Fragment> FragmentActivity.addFragment(id: Int) {
    val fragment = T::class.java
    supportFragmentManager.beginTransaction().add(id, fragment.newInstance()).commit()
}

/**
 * To replace a fragment using `commit()`.
 */
inline fun < reified T: Fragment> FragmentActivity.replaceFragment(id: Int) {
    val fragment = T::class.java
    supportFragmentManager.beginTransaction().replace(id, fragment.newInstance()).commit()
}