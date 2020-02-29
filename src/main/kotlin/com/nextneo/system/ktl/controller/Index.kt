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
        return "index"
    }
}