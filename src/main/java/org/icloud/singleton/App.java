package org.icloud.singleton;


import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings instance = Settings.getInstance();
        Settings instance1 = null;

        try (ObjectOutput outputStream = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            outputStream.writeObject(instance);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInput objectInput = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            instance1 = (Settings) objectInput.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(instance == instance1);

    }

}
