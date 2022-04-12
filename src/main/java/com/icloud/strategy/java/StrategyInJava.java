package com.icloud.strategy.java;

import java.util.ArrayList;
import java.util.Comparator;

public class StrategyInJava {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(5);

        System.out.println(numbers);
        numbers.sort(Comparator.reverseOrder());

        System.out.println(numbers);

    }
}
