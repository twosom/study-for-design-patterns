package com.icloud.command.after;

import com.icloud.command.before.Game;

public class GameEndCommand implements Command {
    private final Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.end();
    }

    @Override
    public void undo() {
        new GameStartCommand(this.game).execute();
    }
}
