package com.icloud.chain_of_responsibilities.before;

public class LoggingRequestHandler extends RequestHandler {
    @Override
    public void handle(Request request) {
        System.out.println("로깅");
        super.handle(request);
    }
}
