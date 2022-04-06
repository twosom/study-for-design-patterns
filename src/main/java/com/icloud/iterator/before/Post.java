package com.icloud.iterator.before;

import java.time.LocalDateTime;
import java.util.Iterator;

public class Post {


    private String title;

    private LocalDateTime createdDateTime;

    public Post(String title) {
        this.title = title;
        this.createdDateTime = LocalDateTime.now();
    }

    public String getTitle() {
        return this.title;
    }

    public LocalDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
}
