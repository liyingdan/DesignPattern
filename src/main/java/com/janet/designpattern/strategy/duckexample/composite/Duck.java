package com.janet.designpattern.strategy.duckexample.composite;

/**
 * @Description TODO
 * @Author Janet
 * @Date 2022-09-03
 */
public class Duck {
    //飞行行为策略接口
    private Fly fly;
    //叫声行为策略接口
    private Call call;

    public Duck(Fly fly, Call call) {
        this.fly = fly;
        this.call = call;
    }

    /**
     * 飞行行为
     */
    public void fly() {
        fly.fly();
    }

    /**
     * 叫声行为
     */
    public void call() {
        call.call();
    }
}
