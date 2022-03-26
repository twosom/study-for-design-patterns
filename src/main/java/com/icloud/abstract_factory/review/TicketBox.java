package com.icloud.abstract_factory.review;

import com.icloud.factorymethod.review.Ticket;

public interface TicketBox {

    Ticket createTicket(String movieName);
}
