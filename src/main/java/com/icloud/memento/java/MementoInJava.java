package com.icloud.memento.java;

import com.icloud.memento.review.Game;

import java.io.*;
import java.util.Date;

public class MementoInJava {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO date
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        date.setTime(time);

        // TODO Serializable
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream("GameSave.hex"))) {
            output.writeObject(game);
        }

        game.setBlueTeamScore(25);
        game.setRedTeamScore(15);

        try (ObjectInput inputStream = new ObjectInputStream(new FileInputStream("GameSave.hex"))) {
            game = (Game) inputStream.readObject();
            System.out.println(game.getBlueTeamScore());
            System.out.println(game.getRedTeamScore());
        }
    }
}
