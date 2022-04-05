package com.icloud.interpreter.before;

import java.util.Stack;

public class PostFixNotation {
    private final String expression;

    public PostFixNotation(String expression) {
        this.expression = expression;
    }

    private void calculate() {
        Stack<Integer> numbers = new Stack<>();

        for (char c : this.expression.toCharArray()) {
            switch (c) {
                case '+':
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                case '-':
                    Integer right = numbers.pop();
                    Integer left = numbers.pop();
                    numbers.push(left - right);
                    break;
                default:
                    numbers.push(Integer.parseInt(String.valueOf(c)));
                    break;
            }
        }

        System.out.println(numbers.pop());
    }

    public static void main(String[] args) {
        PostFixNotation postfixNotation = new PostFixNotation("123+-");
        postfixNotation.calculate();
    }


}
