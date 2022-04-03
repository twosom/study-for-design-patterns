package com.icloud.command.review

class GameEndCommand(private var game: Game): Command {
    override fun execute() {
        this.game.end()
    }

    override fun undo() {
        GameStartCommand(Game()).execute()
    }
}