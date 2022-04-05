package com.icloud.interpreter.review

fun main() {
    val expression: PostfixExpression = PostfixParser.parse("xyz+-")
    val context: Map<Char, Int> = mapOf('x' to 1, 'y' to 2, 'z' to 3)
    val result: Int = expression.interpret(context)


    println(result)
}