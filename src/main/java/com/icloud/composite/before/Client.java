package com.icloud.composite.before;

public class Client {
    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("물약", 50);

        Bag bag = new Bag();
        bag.addItem(doranBlade)
                .addItem(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    private void printPrice(Bag bag) {
        int totalPrice = bag.getItems().stream()
                .mapToInt(Item::getPrice)
                .sum();
        System.out.println(totalPrice);
    }

    private void printPrice(Item itme) {
        System.out.println(itme.getPrice());
    }
}
