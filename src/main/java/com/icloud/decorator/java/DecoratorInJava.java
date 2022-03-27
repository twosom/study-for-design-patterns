package com.icloud.decorator.java;


import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {

    public static void main(String[] args) {
        //Collection 이 제공하는 데코레이터 메소드
        ArrayList list = new ArrayList<>();

        list.add(new Book());
        List books = Collections.checkedList(list, Book.class);

//        books.add(new Item());

        List unmodifiableList = Collections.unmodifiableList(list);
        list.add(new Item());
        unmodifiableList.add(new Book());

        HttpServletRequestWrapper httpServletRequestWrapper;
        HttpServletResponseWrapper httpServletResponseWrapper;

    }

    private static class Book {
    }

    private static class Item {

    }

}
