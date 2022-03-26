package com.icloud.builder.before;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {

        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("리조트");
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 부페에서 식사");
        tourPlan.addPlan(0, "해변가 산책");
        tourPlan.addPlan(0, "점심은 수영장 근처 음식점에서 먹기");
        tourPlan.addPlan(0, "리조트 수영장에서 놀기");
        tourPlan.addPlan(0, "저녁은 BBQ 식당에서 스테이크");
        tourPlan.addPlan(0, "조식 부페에서 식사");
        tourPlan.addPlan(0, "체크아웃");

    }
}