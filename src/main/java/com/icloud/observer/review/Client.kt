package com.icloud.observer.review

fun main() {
    val chatServer = ChatServer()
    val hope = User("hope")
    val twosom = User("twosom")

    chatServer.register("IT", hope)
    chatServer.register("IT", twosom)

    chatServer.sendMessage(hope, "IT", "대박이당!!!")
}