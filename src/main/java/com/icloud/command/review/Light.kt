package com.icloud.command.review

class Light {

    private var isOn: Boolean = false

    fun on() {
        println("불을 켭니다")
        isOn = true
    }

    fun off() {
        println("불을 끕니다.")
        isOn = false
    }

    fun isOn(): Boolean {
        return this.isOn
    }
}