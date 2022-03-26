package com.icloud.abstract_factory.after;

import com.icloud.factorymethod.after.ShipFactory;
import com.icloud.factorymethod.after.Ship;
import com.icloud.factorymethod.after.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    private final ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;

    }
}
