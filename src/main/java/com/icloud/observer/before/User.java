package com.icloud.observer.before;

import java.util.List;

public class User {
    private final ChatServer chatSerer;

    public User(ChatServer chatServer) {
        this.chatSerer = chatServer;
    }

    public void sendMessage(String subject, String message) {
        chatSerer.add(subject, message);
    }

    public List<String> getMessage(String subject) {
        return chatSerer.getMessage(subject);
    }
}
