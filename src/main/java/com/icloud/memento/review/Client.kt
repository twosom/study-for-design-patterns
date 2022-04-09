package com.icloud.memento.review

fun main() {

    val game = Game()
    game.redTeamScore = 10
    game.blueTeamScore = 20

    val savedGame = game.save()
    game.redTeamScore = 40
    game.blueTeamScore = 80
    println("red : ${game.redTeamScore}\nblue : ${game.blueTeamScore}")
    game.restore(savedGame)
    println("red : ${game.redTeamScore}\nblue : ${game.blueTeamScore}")

}