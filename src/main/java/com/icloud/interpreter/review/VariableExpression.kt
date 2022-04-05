package com.icloud.interpreter.review

class VariableExpression(private var variable: Char) : PostfixExpression {
    override fun interpret(context: Map<Char, Int>): Int {
        return context[variable] ?: 0
    }


}