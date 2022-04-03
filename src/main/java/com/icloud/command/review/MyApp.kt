package com.icloud.command.review

class MyApp(private var command: Command) {

    fun press() {
        command.execute()
    }
}

fun main() {
    val myApp: MyApp = MyApp(GameStartCommand(Game()))
    myApp.press()
}