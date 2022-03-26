package com.icloud.builder.after;

import com.icloud.builder.before.TourPlan;

public class App {
    public static void main(String[] args) {
        TourDirector director = new TourDirector();

        TourPlan cancunTrip = director.cancunTrip();
        TourPlan longBeachTrip = director.longBeachTrip();

        System.out.println("longBeachTrip = " + longBeachTrip);
        System.out.println("cancunTrip = " + cancunTrip);

    }
}
