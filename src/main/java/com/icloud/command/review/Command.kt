package com.icloud.command.review

interface Command {

    fun execute()

    fun undo()
}