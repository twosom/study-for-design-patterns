package com.icloud.abstract_factory.review;

import com.icloud.factorymethod.review.IMAXTicket;
import com.icloud.factorymethod.review.Ticket;

/**
 * Client
 */
public class IMAXTicketBox implements TicketBox {

    private final ComboFactory comboFactory;

    public IMAXTicketBox(ComboFactory comboFactory) {
        this.comboFactory = comboFactory;
    }

    @Override
    public Ticket createTicket(String movieName) {
        Ticket ticket = new IMAXTicket(movieName);
        ticket.setPopCorn(comboFactory.createPopCorn());
        ticket.setDrink(comboFactory.createDrink());
        return ticket;
    }
}
