package com.icloud.chain_of_responsibilities.after;

import com.icloud.chain_of_responsibilities.before.Request;

public abstract class RequestHandler {
    private final RequestHandler nextHandler;

    protected RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }


}
