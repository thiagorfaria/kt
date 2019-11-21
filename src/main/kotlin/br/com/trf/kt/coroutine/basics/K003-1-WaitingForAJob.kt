package br.com.trf.kt.coroutine.basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// https://kotlinlang.org/docs/reference/coroutines/basics.html#waiting-for-a-job
fun main() = runBlocking {
    val job = GlobalScope.launch { // launch a new coroutine and keep a reference to its Job
        delay(1000L)
        println("World!")
    }
    print("Hello, ")
    job.join() // wait until child coroutine completes
}