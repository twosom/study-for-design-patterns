package com.icloud.visitor.review.device

import com.icloud.visitor.review.shape.Circle
import com.icloud.visitor.review.shape.Rectangle
import com.icloud.visitor.review.shape.Star

interface Device {
    fun print(shape: Circle)
    fun print(shape: Rectangle)
    fun print(shape: Star)

}