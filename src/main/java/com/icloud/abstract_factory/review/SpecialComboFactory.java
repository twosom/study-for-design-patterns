package com.icloud.abstract_factory.review;

public class SpecialComboFactory implements ComboFactory {


    @Override
    public PopCorn createPopCorn() {
        return new CaramelPopCorn();
    }

    @Override
    public Drink createDrink() {
        return new ZeroCoke();
    }
}
