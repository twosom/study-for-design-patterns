package com.icloud.template.after;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process(Integer::sum);
        System.out.println(result);

        result = fileProcessor.process(Integer::max);
        System.out.println(result);
    }
}
