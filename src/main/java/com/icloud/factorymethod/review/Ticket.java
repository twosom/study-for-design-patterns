package com.icloud.factorymethod.review;

import com.icloud.abstract_factory.review.Drink;
import com.icloud.abstract_factory.review.PopCorn;

public class Ticket {

    private String movieName;
    private Integer price;
    private String type;
    private PopCorn popCorn;
    private Drink drink;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PopCorn getPopCorn() {
        return popCorn;
    }

    public void setPopCorn(PopCorn popCorn) {
        this.popCorn = popCorn;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "movieName='" + movieName + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", popCorn=" + popCorn +
                ", drink=" + drink +
                '}';
    }
}
