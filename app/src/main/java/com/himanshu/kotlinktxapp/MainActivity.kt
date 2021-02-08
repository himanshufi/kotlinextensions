package com.himanshu.kotlinktxapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import com.himanshu.customktx.extensions.activity.shouldFinishAndGoTo
import com.himanshu.customktx.extensions.activity.shouldGoTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       supportFragmentManager.beginTransaction().add(R.id.NO_DEBUG, Fragment())
           .commitNowAllowingStateLoss()
    }
}