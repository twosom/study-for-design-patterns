package org.icloud.factorymethod.before;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = ShipFactory.orderShip("Whiteship", "two_somang@icloud.com");
        System.out.println("whiteship = " + whiteship);

        Ship blackShip = ShipFactory.orderShip("Blackship", "two_somang@icloud.com");
        System.out.println("blackShip = " + blackShip);
    }
}
