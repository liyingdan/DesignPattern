package com.janet.designpattern.strategy.strategydemo;

/**
 * @Description ConcreteStrategy, 封装了具体的方法或行为，实现Strategy接口
 * @Author Janet
 * @Date 2022-09-03
 */
public class ConcreteStrategyA implements Strategy{
    /**
     * 算法A实现方法
     */
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法A实现");
    }
}