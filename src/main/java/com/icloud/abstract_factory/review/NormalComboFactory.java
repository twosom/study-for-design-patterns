package com.icloud.abstract_factory.review;

public class NormalComboFactory implements ComboFactory {


    @Override
    public PopCorn createPopCorn() {
        return new DefaultPopCorn();
    }

    @Override
    public Drink createDrink() {
        return new Pepsi();
    }
}
