package com.icloud.chain_of_responsibilities.before;

public class RequestHandler {
    public void handle(Request request) {

        System.out.println(request.getBody());
    }
}
