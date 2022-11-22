package com.janet.designpattern.decorator.decoratordemo;

/**
 * @author Janet Li
 * @createTime 2022/11/18
 */
public class Demo {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        concreteComponent.operation();
        System.out.println("--------------------------------");

        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(concreteComponent);
        concreteDecoratorA.operation();
        System.out.println("--------------------------------");

        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);
        concreteDecoratorB.operation();
    }
}
