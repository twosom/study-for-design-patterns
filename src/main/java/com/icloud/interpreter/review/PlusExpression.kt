package com.icloud.interpreter.review

class PlusExpression(
    private var left: PostfixExpression,
    private var right: PostfixExpression
) : PostfixExpression {

    override fun interpret(context: Map<Char, Int>): Int {
        return left.interpret(context) + right.interpret(context)
    }

}