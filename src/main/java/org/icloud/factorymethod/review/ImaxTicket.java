package org.icloud.factorymethod.review;

public class ImaxTicket extends Ticket {
    public ImaxTicket(String movieName) {
        setType("IMAX");
        setPrice(18_000);
        setMovieName(movieName);
    }
}
