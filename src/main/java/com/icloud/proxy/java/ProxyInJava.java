package com.icloud.proxy.java;

import com.icloud.proxy.after.DefaultGameService;
import com.icloud.proxy.after.GameService;

import java.lang.reflect.Proxy;

public class ProxyInJava {
    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameServiceProxy = getGAmeServiceProxy(new DefaultGameService());
        gameServiceProxy.startGame();
    }

    private GameService getGAmeServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{GameService.class}, (proxy, method, args) -> {
                    System.out.println("Hello dynamic proxy");
                    method.invoke(target, args);
                    return null;
                });
    }
}
