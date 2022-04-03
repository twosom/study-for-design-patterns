package com.icloud.command.review

import java.util.Stack

class Button {

    private var commands: Stack<Command> = Stack()

    fun press(command: Command) {
        command.execute()
        commands.push(command)
    }

    fun undo() {
        if (!commands.isEmpty()) {
            commands.pop().undo()
        }
    }

}

fun main() {

    val button: Button = Button()
    button.press(GameStartCommand(Game()))
    button.press(LightOnCommand(Light()))
    button.undo()
    button.undo()
}