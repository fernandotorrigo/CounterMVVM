package com.ftorrigo.countermvvm.ui.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterScreenViewModel : ViewModel() {
    private val _count = mutableIntStateOf(0)

    val count: MutableState<Int> = _count

    fun increment() {
        _count.intValue++
    }

    fun decrement() {
        _count.intValue--
    }
}