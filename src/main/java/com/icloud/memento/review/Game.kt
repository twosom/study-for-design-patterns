package com.icloud.memento.review

class Game: java.io.Serializable {
    var blueTeamScore: Int? = null
    var redTeamScore: Int? = null

    fun save(): GameSave {
        return GameSave(this.redTeamScore ?: 0, this.blueTeamScore ?: 0)
    }

    fun restore(gameSave: GameSave) {
        this.blueTeamScore = gameSave.blueTeamScore
        this.redTeamScore = gameSave.redTeamScore
    }
}
