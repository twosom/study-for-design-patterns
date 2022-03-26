package com.icloud.abstract_factory.review;

import com.icloud.factorymethod.review.Ticket;

public class TicketClient {
    public static void main(String[] args) {
        TicketBox ticketBox = new IMAXTicketBox(new SpecialComboFactory());
        Ticket ticket = ticketBox.createTicket("TENET");
        System.out.println("ticket = " + ticket);


        ticketBox = new IMAXTicketBox(new NormalComboFactory());
        ticket = ticketBox.createTicket("The Batman");
        System.out.println("ticket = " + ticket);
    }
}
