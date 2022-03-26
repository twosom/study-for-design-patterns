package com.icloud.factorymethod.review;

public class ImaxTicketFactory implements TicketFactory {


    @Override
    public Ticket createTicket(String movieName) {
        return new IMAXTicket(movieName);
    }
}
