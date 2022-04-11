package com.icloud.observer.review

interface Subscriber {
    fun handleMessage(message: String)

}