package com.janet.designpattern.strategy.strategydemo;

/**
 * @Description 客户端代码
 * @Author Janet
 * @Date 2022-09-03
 */
public class Demo {
    public static void main(String[] args) {

        Context context;

        //由于实例化不同的策略，所以最终在调用context.ContextInterface();时，得到的结果就不尽相同。
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();

    }
}
