package com.janet.designpattern.factory.factorymethod;

import com.janet.designpattern.factory.simplefactory.Operation;

/**
 * @Description TODO
 * @Author Janet
 * @Date 2022-11-22
 */
public class Demo {
    public static void main(String[] args) {
        IFactory operationFactory = new AddFactory();
        Operation operation = operationFactory.createOperation();
        operation.setNumber1(1);
        operation.setNumber2(2);
        int result = operation.getResult();
    }
}
