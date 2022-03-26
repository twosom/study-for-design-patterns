package com.icloud.builder.java;

import java.util.stream.Stream;

public class StreamBuilder {

    public static void main(String[] args) {
        Stream.<String>builder()
                .add("keesun")
                .add("whiteship")
                .build()
                .forEach(System.out::println);

    }
}
