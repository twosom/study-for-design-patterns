package com.icloud.chain_of_responsibilities.after;

import com.icloud.chain_of_responsibilities.before.Request;

public class Client {
    private final RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("이번 놀이는 뽑기");
        this.requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));

        Client client = new Client(chain);
        client.doWork();
    }
}
