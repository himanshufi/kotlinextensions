package com.himanshu.customktx.extensions.background

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.himanshu.customktx.utils.ControlledRunner
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

fun ViewModel.loadRequest(context:Context, block: suspend () -> Unit): Job {
    return viewModelScope.launch {
        try {
            block()
        }catch (ex: Exception) {
                Toast.makeText(context, ex.message, Toast.LENGTH_LONG).show()
        }
    }
}

suspend fun <T:Any> ControlledRunner<T>.cancelLastThenRun(block: suspend () -> T): T {
    return cancelPreviousThenRun(block)
}

suspend fun <T:Any> ControlledRunner<T>.addLastThenRun(block: suspend () -> T): T {
    return joinPreviousOrRun(block)
}
