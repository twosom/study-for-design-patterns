package com.icloud.visitor.review

import com.icloud.visitor.review.device.Device
import com.icloud.visitor.review.device.Tablet
import com.icloud.visitor.review.shape.Shape
import com.icloud.visitor.review.shape.Star

fun main() {
    val star: Shape = Star()
    val tablet: Device = Tablet()

    star.accept(tablet)
}