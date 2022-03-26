package com.icloud.factorymethod.java;

import com.icloud.factorymethod.after.BlackShip;
import com.icloud.factorymethod.after.WhiteShip;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }

}
