package com.icloud.visitor.before;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();

        rectangle.printTo(new Phone());
    }
}
