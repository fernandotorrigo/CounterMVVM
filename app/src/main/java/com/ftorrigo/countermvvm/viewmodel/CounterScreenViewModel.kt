package com.ftorrigo.countermvvm.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel
import com.ftorrigo.countermvvm.repository.CounterRepository

class CounterScreenViewModel() : ViewModel() {
    private val repository: CounterRepository = CounterRepository()
    private val _count = mutableIntStateOf(repository.getCounter().cont)

    val count: MutableState<Int> = _count

    fun increment() {
        repository.incrementCounter()
    }

    fun decrement() {
        repository.decrementCounter()
    }
}