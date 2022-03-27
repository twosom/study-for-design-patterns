package com.icloud.composite.before;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Item> items = new ArrayList<>();

    public Bag addItem(Item item) {
        this.items.add(item);
        return this;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
