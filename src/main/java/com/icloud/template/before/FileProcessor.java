package com.icloud.template.before;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

    private final String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    public int process() {
        try (var reader = new BufferedReader(new FileReader(this.path))) {
            int result = 0;
            String line = null;
            while ((line = reader.readLine()) != null) {
                result += Integer.parseInt(line);
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
