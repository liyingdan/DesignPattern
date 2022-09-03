package com.janet.designpattern.strategy.duckexample.composite;

/**
 * @Description TODO
 * @Author Janet
 * @Date 2022-09-03
 */
public class FlyOne implements Fly {
    @Override
    public void fly() {
        System.out.println("飞1米高");
    }
}
