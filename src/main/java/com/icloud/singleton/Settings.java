package com.icloud.singleton;


import java.io.Serializable;

public class Settings implements Serializable {

    private Settings() {

    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

    static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }
}
