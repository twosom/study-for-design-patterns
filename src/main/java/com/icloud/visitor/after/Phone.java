package com.icloud.visitor.after;

public class Phone implements Device {

    @Override
    public void print(Circle circle) {
        System.out.println("Print Circle to Phone");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Print Rectable to Phone");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("Print Trigangle to Phone");
    }
}
