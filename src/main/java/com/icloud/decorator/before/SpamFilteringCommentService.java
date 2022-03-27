package com.icloud.decorator.before;

public class SpamFilteringCommentService extends CommentService {

    @Override
    public void addComment(String comment) {
        boolean isSpam = isSpan(comment);
        if (!isSpam) {
            super.addComment(comment);
        }
    }

    private boolean isSpan(String comment) {
        return comment.contains("http");
    }
}
