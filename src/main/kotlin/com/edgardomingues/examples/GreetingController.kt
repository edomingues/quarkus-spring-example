package com.edgardomingues.examples

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.ws.rs.PathParam

@RestController
@RequestMapping("/greeting")
internal class GreetingController(private val greetingService: GreetingService) {

    @GetMapping
    fun hello(@RequestParam(defaultValue = "world") name: String) = greetingService.hello(name)
}