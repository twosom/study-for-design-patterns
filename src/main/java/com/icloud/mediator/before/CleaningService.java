package com.icloud.mediator.before;

public class CleaningService {
    public void clean(Gym gym) {
        System.out.println("clean " + gym);
    }

    public void clean(Restaurant restaurant) {
        System.out.println("clean " + restaurant);
    }

    public void getTower(Guest guest, int numberOfTower) {
        System.out.println(numberOfTower + " towers to " + guest);
    }
}
