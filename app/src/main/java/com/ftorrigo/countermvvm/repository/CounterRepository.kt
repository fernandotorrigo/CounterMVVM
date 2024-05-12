package com.ftorrigo.countermvvm.repository

import com.ftorrigo.countermvvm.model.CounterModel

class CounterRepository {
    private var counter = CounterModel(0)

    fun getCounter() = counter

    fun incrementCounter() {
        counter.cont++
    }

    fun decrementCounter() {
        counter.cont--
    }

}