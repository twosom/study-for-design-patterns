package com.icloud.iterator.review

import java.util.*


fun main() {
    val board = Board()
    board.addPost("디자인 패턴 게임")
    board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?")
    board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하시고 계십니다.")

    val posts = board.posts
    for ((index: Int) in posts.withIndex()) {
        val post = posts[index]
        println(post.title)
    }

    val iterator = board.getRecentPostIterator()
    while (iterator.hasNext()) {
        println(iterator.next().title)
    }


}