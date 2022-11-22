package com.janet.designpattern.decorator.decoratordemo;

/**
 * 具体的装饰对象，起到给 Component 添加职责的功能
 * @author Janet Li
 * @createTime 2022/11/18
 */
public class ConcreteDecoratorA extends Decorator {
    //本类的独有功能，以区别于ConcreteDecoratorB
    private String addedState;

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    /**
     * 重写operation()，实际执行的是Component的operation()
     */
    @Override
    public void operation() {
        //首先运行Component的operation()，再执行本类的功能，如addedState，相当于对原Component进行了装饰。
        component.operation();

        addedState = "New State";

        System.out.println("具体装饰对象A的操作");
    }
}
