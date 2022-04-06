package com.icloud.iterator.before;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Post> posts = new ArrayList<>();
    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public List<Post> getPosts() {
        return posts;
    }
}
