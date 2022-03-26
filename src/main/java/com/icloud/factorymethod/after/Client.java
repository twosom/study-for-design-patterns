package com.icloud.factorymethod.after;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "two_somang@icloud.com");

        client.print(new BlackShipFactory(), "blackship", "two_somang@icloud.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
