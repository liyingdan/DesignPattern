package com.janet.designpattern.strategy.strategydemo;

/**
 * @Description Context，用一个 ConcreteStrategy 来配置，维护一个对 Strategy 对象的引用
 * @Author Janet
 * @Date 2022-09-03
 */
public class Context {
    private Strategy strategy;

    /**
     * 初始化时，传入具体的策略对象
     * @param strategy
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    /**
     * 上下文接口，根据具体的策略对象，调用其他算法的方法
     */
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}
