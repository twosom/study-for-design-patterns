package com.icloud.visitor.before;

public class Triangle implements Shape {

    @Override
    public void printTo(Device device) {
        if (device instanceof Phone) {
            System.out.println("Print Rectangle to Phone");
        } else if (device instanceof Watch) {
            System.out.println("Print Rectangle to watch");
        }
    }
}
