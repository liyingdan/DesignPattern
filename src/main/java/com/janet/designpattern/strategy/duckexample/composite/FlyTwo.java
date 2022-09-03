package com.janet.designpattern.strategy.duckexample.composite;

/**
 * @Description TODO
 * @Author Janet
 * @Date 2022-09-03
 */
public class FlyTwo implements Fly {
    @Override
    public void fly() {
        System.out.println("飞2米高");
    }
}
