package com.icloud.visitor.review.shape

import com.icloud.visitor.review.device.Device

class Star : Shape {
    override fun accept(device: Device) {
        device.print(this)
    }
}