package com.nextneo.system.ktl.controller

import com.nextneo.system.ktl.utils.path.ResourcePath
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(ResourcePath.Index.INDEX)
class IndexController (){

    @GetMapping()
    fun index(): String {

        var count: Int = 1

        val answerString = when {
            count == 42 -> "I have the answer."
            count > 35 -> "The answer is close."
            else -> "The answer eludes me."
        }
        println(answerString)

        val languageName: String? = null
        println(languageName?.toUpperCase())


        return "index"
    }
}