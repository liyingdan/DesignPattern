package com.janet.designpattern.strategy.duckexample;

import com.janet.designpattern.strategy.duckexample.composite.*;

/**
 * @Description TODO
 * @Author Janet
 * @Date 2022-09-03
 */
public class CompositeDuckExample {
    public static void main(String[] args) {
        //嘎嘎嘎，不会飞的鸭子
        Duck duck = new Duck(new NoFly(), new GaCall());
        duck.call();
        duck.fly();
        //嘎嘎嘎，会飞1米高的鸭子
        duck = new Duck(new FlyOne(), new GaCall());
        duck.call();
        duck.fly();
        //嘎嘎嘎，会飞2米高的鸭子
        duck = new Duck(new FlyTwo(), new GaCall());
        duck.call();
        duck.fly();
        //吱吱吱，不会飞的鸭子
        duck = new Duck(new NoFly(), new ZhiCall());
        duck.call();
        duck.fly();
        //吱吱吱，会飞1米高的鸭子
        duck = new Duck(new FlyOne(), new ZhiCall());
        duck.call();
        duck.fly();
        //吱吱吱，会飞2米高的鸭子
        duck = new Duck(new FlyTwo(), new ZhiCall());
        duck.call();
        duck.fly();
    }
}
