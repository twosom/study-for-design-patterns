package com.icloud.visitor.review.device

import com.icloud.visitor.review.shape.Circle
import com.icloud.visitor.review.shape.Rectangle
import com.icloud.visitor.review.shape.Star

class Phone : Device {
    override fun print(shape: Circle) {
        println("Print Circle to Phone")
    }

    override fun print(shape: Rectangle) {
        println("Print Rectangle to Phone")
    }

    override fun print(shape: Star) {
        println("Print Start to Phone")
    }

}