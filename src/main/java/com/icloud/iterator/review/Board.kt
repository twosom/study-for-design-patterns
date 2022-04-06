package com.icloud.iterator.review

class Board {

    var posts: List<Post> = ArrayList()

    fun addPost(content: String) {
        this.posts += Post(content)
    }

    fun getRecentPostIterator(): Iterator<Post> {
        return RecentIterator(this.posts)
    }


}