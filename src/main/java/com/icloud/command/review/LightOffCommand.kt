package com.icloud.command.review

class LightOffCommand(private var light: Light) : Command {
    override fun execute() {
        this.light.off()
    }

    override fun undo() {
        LightOnCommand(Light()).execute()
    }

}