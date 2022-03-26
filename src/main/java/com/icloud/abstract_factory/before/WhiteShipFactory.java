package com.icloud.abstract_factory.before;

import com.icloud.factorymethod.after.ShipFactory;
import com.icloud.factorymethod.after.Ship;
import com.icloud.factorymethod.after.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;

    }
}
