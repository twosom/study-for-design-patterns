package com.icloud.proxy.java;

import org.springframework.stereotype.Service;

@Service
public class GameService {

    public void startGame() {
        System.out.println("이 자리에 오신 여러분을 진심을 환영합니다.");
    }

    @HelloAnnotation
    public void stopGame() {
        System.out.println("안녕하세요.");
    }
}
