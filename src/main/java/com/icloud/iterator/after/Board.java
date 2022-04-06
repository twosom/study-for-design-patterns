package com.icloud.iterator.after;

import com.icloud.iterator.before.Post;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {

    private List<Post> posts = new ArrayList<>();

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public List<Post> getPosts() {
        return posts;
    }

    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(this.posts);
    }
}
