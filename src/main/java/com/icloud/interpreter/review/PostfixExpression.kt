package com.icloud.interpreter.review

interface PostfixExpression {

    fun interpret(context: Map<Char, Int>): Int

    companion object {
        fun plus(left: PostfixExpression, right: PostfixExpression): PostfixExpression {
            return object : PostfixExpression {
                override fun interpret(context: Map<Char, Int>): Int {
                    return left.interpret(context) + right.interpret(context)
                }
            }
        }

        fun multiply(left: PostfixExpression, right: PostfixExpression): PostfixExpression {
            return object : PostfixExpression {
                override fun interpret(context: Map<Char, Int>): Int {
                    return left.interpret(context) * right.interpret(context)
                }
            }
        }
    }

}