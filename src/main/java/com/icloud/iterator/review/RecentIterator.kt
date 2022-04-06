package com.icloud.iterator.review

import java.util.Collections.sort

class RecentIterator(posts: List<Post>) : Iterator<Post> {

    private var internalIterator: Iterator<Post>

    init {
        sort(posts) { p1, p2 -> p2.createdDateTime.compareTo(p1.createdDateTime) }
        this.internalIterator = posts.iterator()
    }

    override fun hasNext(): Boolean {
        return this.internalIterator.hasNext()
    }

    override fun next(): Post {
        return this.internalIterator.next()
    }
}