package com.icloud.command.review

class LightOnCommand(private var light: Light) : Command {

    override fun execute() {
        light.on()
    }

    override fun undo() {
        LightOffCommand(Light()).execute()
    }

}