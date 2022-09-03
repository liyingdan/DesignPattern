package com.janet.designpattern.strategy.duckexample.extend;

/**
 * 嘎嘎嘎，会飞1米高的鸭子
 * @Description TODO
 * @Author Janet
 * @Date 2022-09-03
 */
public class Duck2 extends Duck {
    @Override
    public void fly() {
        System.out.println("飞1米高");
    }

    @Override
    public void call() {
        System.out.println("嘎嘎嘎");
    }
}
