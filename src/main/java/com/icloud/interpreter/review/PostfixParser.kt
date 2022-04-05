package com.icloud.interpreter.review

import java.util.*

class PostfixParser {
    companion object {
        fun parse(expression: String): PostfixExpression {
            val stack = Stack<PostfixExpression>()
            expression.toCharArray().forEach { c: Char ->
                stack.push(getExpression(c, stack))
            }

            return stack.pop()
        }

        //TODO xyz+-
        private fun getExpression(c: Char, stack: Stack<PostfixExpression>): PostfixExpression {
            return when (c) {
                '+' -> PlusExpression(stack.pop(), stack.pop())
                '-' -> {
                    val right = stack.pop()
                    val left = stack.pop()
                    MinusExpression(left, right)
                }
                else -> VariableExpression(c)
            }
        }
    }
}