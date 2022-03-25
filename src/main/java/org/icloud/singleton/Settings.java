package org.icloud.singleton;


import java.io.Serializable;

public class Settings implements Serializable {

    private Settings() {

    }


    static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }


    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
