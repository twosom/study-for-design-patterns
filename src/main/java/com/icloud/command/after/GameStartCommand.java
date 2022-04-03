package com.icloud.command.after;

import com.icloud.command.before.Game;

public class GameStartCommand implements Command {
    private final Game game;

    public GameStartCommand(Game game) {
        this.game = game;

    }

    @Override
    public void execute() {
        game.start();
    }

    @Override
    public void undo() {
        new GameEndCommand(this.game).execute();
    }
}
