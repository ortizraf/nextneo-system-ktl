package com.nextneo.system.ktl.controller

import com.nextneo.system.ktl.service.UserService
import com.nextneo.system.ktl.utils.path.ResourcePath
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(ResourcePath.User.USER)
class UserController (val service: UserService){

    @GetMapping(ResourcePath.User.FIND_BY_ID)
    fun findById(@PathVariable("id") id: Long): String {

        return service.findById(id)

    }
}