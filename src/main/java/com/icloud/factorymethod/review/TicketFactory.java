package com.icloud.factorymethod.review;

public interface TicketFactory {

    Ticket createTicket(String movieName);

    default Ticket buyTicket(String movieName, String customerName) {
        validateTicket(movieName, customerName);
        prepare(customerName, movieName);
        Ticket ticket = createTicket(movieName);
        notifyToCustomer(customerName, movieName);
        return ticket;
    }

    private void notifyToCustomer(String customerName, String movieName) {
        System.out.println(customerName + "님, " + movieName + " 티켓이 잘 발부되었습니다.");
    }

    private void prepare(String customerName, String movieName) {
        System.out.println(customerName + " 님에게 " + movieName + "영화티켓을 발부합니다.");
    }

    private void validateTicket(String movieName, String customerName) {
        if (movieName == null || movieName.isBlank()) {
            throw new IllegalArgumentException("movieName must filled");
        }

        if (customerName == null || customerName.isBlank()) {
            throw new IllegalArgumentException("customerName must filled");
        }
    }
}
