package com.icloud.observer.java;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class FlowInJava {
    public static void main(String[] args) {
        Flow.Publisher<String> publisher = new Flow.Publisher<>() {
            @Override
            public void subscribe(Flow.Subscriber<? super String> subscriber) {
                subscriber.onNext("hello flow");
                subscriber.onComplete();
            }
        };
        Flow.Subscriber<String> subscriber = new Flow.Subscriber<>() {

            @Override
            public void onSubscribe(Flow.Subscription subscription) {

            }

            @Override
            public void onNext(String item) {
                System.out.println(item);
            }

            @Override
            public void onError(Throwable throwable) {
            }

            @Override
            public void onComplete() {
                System.out.println("complete");

            }
        };
        publisher.subscribe(subscriber);
        System.out.println("이게 출력이 되기 전에 이미 처리가 다 끝남.");
        System.out.println("=============================");

        publisher = new SubmissionPublisher<>();

        subscriber = new Flow.Subscriber<>() {

            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println("sub!");
                this.subscription = subscription;
                this.subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                System.out.println("onNext called");
                System.out.println(Thread.currentThread().getName());
                System.out.println(item);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                System.out.println("completed");
            }
        };


        publisher.subscribe(subscriber);
        ((SubmissionPublisher<String>) publisher).submit("hello java");
        System.out.println("이게 먼저 출력될 수도 있습니다.");
    }
}
