package com.icloud.observer.before;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    private final Map<String, List<String>> messages = new HashMap<>();

    public void add(String subject, String message) {
        if (messages.containsKey(subject)) {
            messages.get(subject).add(message);
        } else {
            var list = new ArrayList<String>();
            list.add(message);
            messages.put(subject, list);
        }
    }

    public List<String> getMessage(String subject) {
        return messages.get(subject);
    }


}
