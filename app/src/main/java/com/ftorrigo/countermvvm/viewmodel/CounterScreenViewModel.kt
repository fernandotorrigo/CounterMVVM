package com.ftorrigo.countermvvm.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel
import com.ftorrigo.countermvvm.repository.CounterRepository

class CounterScreenViewModel : ViewModel() {
    private val _repository: CounterRepository = CounterRepository()
    private val _count = mutableIntStateOf(_repository.getCounter().count)

    val count: MutableState<Int> = _count

    fun increment() {
        _repository.incrementCounter()
        _count.intValue = _repository.getCounter().count
    }

    fun decrement() {
        _repository.decrementCounter()
        _count.intValue = _repository.getCounter().count
    }
}