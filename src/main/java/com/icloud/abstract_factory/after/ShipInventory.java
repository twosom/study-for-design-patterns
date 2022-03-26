package com.icloud.abstract_factory.after;

import com.icloud.factorymethod.after.Ship;
import com.icloud.factorymethod.after.ShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println("ship = " + ship);

    }
}
