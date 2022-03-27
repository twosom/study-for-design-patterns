package com.icloud.decorator.after;

public class CommentDecorator implements CommentService {

    private final CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        this.commentService.addComment(comment);
    }
}
