package com.nextneo.system.ktl.service

import org.springframework.stereotype.Service

@Service
class UserService() {

    fun findById(id: Long): String {
        return "Teste " +id
    }

}