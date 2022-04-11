package com.icloud.observer.review

class User() : Subscriber {
    var name: String? = null

    constructor(name: String) : this() {
        this.name = name
    }


    override fun handleMessage(message: String) {
        println(message)
    }
}