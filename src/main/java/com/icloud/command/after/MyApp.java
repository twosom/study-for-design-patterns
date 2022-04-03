package com.icloud.command.after;

import com.icloud.command.before.Game;

public class MyApp {
    private final Command command;

    public MyApp(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new GameStartCommand(new Game()));
        myApp.press();
    }
}
