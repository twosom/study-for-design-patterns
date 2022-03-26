package com.icloud.factorymethod.review;

public class NormalTicketFactory implements TicketFactory {
    @Override
    public Ticket createTicket(String movieName) {
        return new NormalTicket(movieName);
    }
}
