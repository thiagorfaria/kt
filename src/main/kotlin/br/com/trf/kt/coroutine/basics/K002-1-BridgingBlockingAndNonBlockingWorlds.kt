package br.com.trf.kt.coroutine.basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// https://kotlinlang.org/docs/reference/coroutines/basics.html#bridging-blocking-and-non-blocking-worlds
fun main() = runBlocking {
    GlobalScope.launch {
        // launch a new coroutine in background and continue
        delay(1000L)
        println("World!")
    }
    print("Hello, ") // main thread continues here immediately
    delay(2000L)  // ... while we delay for 2 seconds to keep JVM alive
}