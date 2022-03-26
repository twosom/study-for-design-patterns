package com.icloud.abstract_factory.after;

/**
 * AbstractFactory
 */
public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
