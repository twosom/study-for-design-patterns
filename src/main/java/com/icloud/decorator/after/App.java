package com.icloud.decorator.after;

public class App {

    private static boolean isSpamFilter = true;

    private static boolean isTrimmingFilter = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();
        if (isSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (isTrimmingFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }
}
