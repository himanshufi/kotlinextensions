package com.himanshu.kotlinktxapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.himanshu.customktx.extensions.activity.shouldFinishAndGoTo
import com.himanshu.customktx.extensions.activity.shouldGoTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}