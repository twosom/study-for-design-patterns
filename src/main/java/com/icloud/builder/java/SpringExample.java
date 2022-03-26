package com.icloud.builder.java;

import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {
    public static void main(String[] args) {
        var howToStudyJava = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.whiteship.me")
                .queryParam("query", "java-playlist-ep1")
                .queryParam("name", "whiteship")
                .queryParam("region", "South Korea")
                .build()
                .encode();

        System.out.println(howToStudyJava);

    }
}
