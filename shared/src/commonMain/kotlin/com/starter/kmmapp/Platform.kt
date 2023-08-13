package com.starter.kmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform