package com.icloud.command.review

class GameStartCommand(private var game: Game): Command {
    override fun execute() {
        this.game.start()
    }

    override fun undo() {
        GameEndCommand(Game()).execute()
    }
}