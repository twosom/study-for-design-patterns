package com.icloud.abstract_factory.after;

import com.icloud.abstract_factory.before.WhiteAnchor;
import com.icloud.abstract_factory.before.WhiteWheel;

/**
 * ConcreteFactory
 */
public class WhiteShipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
