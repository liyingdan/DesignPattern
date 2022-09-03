package com.janet.designpattern.strategy.strategydemo;

/**
 * @Description ConcreteStrategy, 封装了具体的方法或行为，继承于Strategy
 * @Author Janet
 * @Date 2022-09-03
 */
public class ConcreteStrategyB extends Strategy {
    /**
     * 算法B实现方法
     */
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法B实现");
    }
}
