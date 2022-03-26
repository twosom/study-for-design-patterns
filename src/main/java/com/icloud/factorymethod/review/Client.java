package com.icloud.factorymethod.review;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new ImaxTicketFactory(), "The Batman", "twosom");
        client.print(new NormalTicketFactory(), "The Batman", "another twosom");
    }

    private void print(TicketFactory ticketFactory, String movieName, String customerName) {
        Ticket ticket = ticketFactory.buyTicket(movieName, customerName);
        System.out.println("ticket = " + ticket);
    }
}
