package com.icloud.adapter.java;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class AdapterInJava {

    public static void main(String[] args) {
        // collections
        List<String> strings = Arrays.asList("a", "b", "c");
        Enumeration<String> enumeration = Collections.enumeration(strings);
        List<String> list = Collections.list(enumeration);

        // io
        try (InputStream inputStream = new FileInputStream("input.txt")) {
            Reader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
