package com.janet.designpattern.strategy.duckexample.extend;

/**
 * 吱吱吱，不会飞的鸭子
 * @Description TODO
 * @Author Janet
 * @Date 2022-09-03
 */
public class Duck4 extends Duck {
    @Override
    public void fly() {
    }

    @Override
    public void call() {
        System.out.println("吱吱吱");
    }
}
