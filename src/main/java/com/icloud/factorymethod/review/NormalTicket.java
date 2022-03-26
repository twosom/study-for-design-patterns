package com.icloud.factorymethod.review;

public class NormalTicket extends Ticket {
    public NormalTicket(String movieName) {
        setType("NORMAL");
        setPrice(10_000);
        setMovieName(movieName);
    }
}
