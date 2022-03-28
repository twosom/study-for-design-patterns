package com.icloud.facade.after;

public class Client {
    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setTo("twosom");
        emailMessage.setFrom("two_somang");
        emailMessage.setSubject("Hello World");
        emailMessage.setText("hello frield");
        emailSender.send(emailMessage);
    }
}
