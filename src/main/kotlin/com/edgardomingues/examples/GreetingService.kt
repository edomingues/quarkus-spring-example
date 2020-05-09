package com.edgardomingues.examples

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class GreetingService(@Value("\${greeting.message}") private val message: String) {

    fun hello(name: String) = Greeting("$message $name")
}