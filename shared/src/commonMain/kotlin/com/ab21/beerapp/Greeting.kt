package com.ab21.beerapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}