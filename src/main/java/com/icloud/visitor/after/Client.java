package com.icloud.visitor.after;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device phone = new Pad();
        rectangle.accept(phone);
    }
}
