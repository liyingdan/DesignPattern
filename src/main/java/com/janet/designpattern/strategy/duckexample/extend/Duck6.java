package com.janet.designpattern.strategy.duckexample.extend;

/**
 * 吱吱吱，会飞2米高的鸭子
 * @Description TODO
 * @Author Janet
 * @Date 2022-09-03
 */
public class Duck6 extends Duck {
    @Override
    public void fly() {
        System.out.println("飞2米高");
    }

    @Override
    public void call() {
        System.out.println("吱吱吱");
    }
}
