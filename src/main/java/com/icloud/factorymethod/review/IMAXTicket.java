package com.icloud.factorymethod.review;

public class IMAXTicket extends Ticket {
    public IMAXTicket(String movieName) {
        setType("IMAX");
        setPrice(18_000);
        setMovieName(movieName);
    }
}
