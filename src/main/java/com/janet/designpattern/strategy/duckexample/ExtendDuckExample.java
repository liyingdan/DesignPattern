package com.janet.designpattern.strategy.duckexample;

import com.janet.designpattern.strategy.duckexample.extend.*;

/**
 * @Description TODO
 * @Author Janet
 * @Date 2022-09-03
 */
public class ExtendDuckExample {
    public static void main(String[] args) {
        //嘎嘎嘎，不会飞的鸭子
        Duck duck = new Duck1();
        duck.call();
        duck.fly();
        //嘎嘎嘎，会飞1米高的鸭子
        duck = new Duck2();
        duck.call();
        duck.fly();
        //嘎嘎嘎，会飞2米高的鸭子
        duck = new Duck3();
        duck.call();
        duck.fly();
        //吱吱吱，不会飞的鸭子
        duck = new Duck4();
        duck.call();
        duck.fly();
        //吱吱吱，会飞1米高的鸭子
        duck = new Duck5();
        duck.call();
        duck.fly();
        //吱吱吱，会飞2米高的鸭子
        duck = new Duck6();
        duck.call();
        duck.fly();
    }
}
