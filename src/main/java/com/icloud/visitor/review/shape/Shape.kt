package com.icloud.visitor.review.shape

import com.icloud.visitor.review.device.Device

interface Shape {
    fun accept(device: Device)
}