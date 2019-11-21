package br.com.trf.kt.coroutine.basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// https://kotlinlang.org/docs/reference/coroutines/basics.html#extract-function-refactoring
fun main() = runBlocking {
    launch {
        doWorld()
    }
    print("Hello, ")
}

// this is your first suspending function
private suspend fun doWorld() {
    delay(1000L)
    println("World!")
}

