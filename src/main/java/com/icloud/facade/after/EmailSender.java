package com.icloud.facade.after;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {

    private final EmailSettings emailSettings;

    public EmailSender(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }

    /**
     * 이메일을 보내는 메소드
     *
     * @param emailMessage 이메일 메시지
     */
    public void send(EmailMessage emailMessage) {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", emailSettings.getHost());
        Session session = Session.getDefaultInstance(properties);
        try {
            MimeMessage message = emailMessage.mimeMessage(session);
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
