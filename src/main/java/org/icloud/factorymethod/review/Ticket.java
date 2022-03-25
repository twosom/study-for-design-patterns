package org.icloud.factorymethod.review;

public class Ticket {

    private String movieName;
    private Integer price;

    private String type;

    @Override
    public String toString() {
        return "Ticket{" +
                "movieName='" + movieName + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }

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
}
