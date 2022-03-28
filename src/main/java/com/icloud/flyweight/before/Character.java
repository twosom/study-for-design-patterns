package com.icloud.flyweight.before;

public class Character {
    char value;

    String color;

    String fontFamily;

    int fontSize;

    public Character(char value, String color, String fontFamily, int fontSize) {
        this.value = value;
        this.color = color;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }
}
