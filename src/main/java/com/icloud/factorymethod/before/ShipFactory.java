package com.icloud.factorymethod.before;

public class ShipFactory {
    public static Ship orderShip(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);


        // Customizing
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("🛥");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("⚓");
        }

        // Coloring
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setColor("white");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setColor("balck");
        }

        sendEmailTo(email, ship);

        return ship;
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
