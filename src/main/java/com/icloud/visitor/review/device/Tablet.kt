package com.icloud.visitor.review.device

import com.icloud.visitor.review.shape.Circle
import com.icloud.visitor.review.shape.Rectangle
import com.icloud.visitor.review.shape.Star

class Tablet : Device {
    override fun print(shape: Circle) {
        println("Print Circle to Tablet")
    }

    override fun print(shape: Rectangle) {
        println("Print Rectangle to Tablet")
    }

    override fun print(shape: Star) {
        println("Print Start to Tablet")
    }
}