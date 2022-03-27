package com.icloud.bridge.review;

public class DefaultChampion implements Champion {

    private final String name;

    private final Skin skin;

    public DefaultChampion(String name, Skin skin) {
        this.name = name;
        this.skin = skin;
    }


    @Override
    public void showDetail() {
        System.out.printf("name : %s\nskin : %s", name, skin.getName());
    }
}
