package com.icloud.strategy.after;

public class Client {
    public static void main(String[] args) {
        var game = new BlueLightRedLight();
        game.blueLight(new Normal());
        game.redLight(new Faster());
        game.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("bluelignt");
            }

            @Override
            public void redLight() {
                System.out.println("redLight");
            }
        });
    }
}
