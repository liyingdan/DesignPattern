package com.janet.designpattern.factory.simplefactory;

import com.janet.designpattern.factory.simplefactory.oper.impl.OperationDiv;
import com.janet.designpattern.factory.simplefactory.oper.impl.OperationMul;
import com.janet.designpattern.factory.simplefactory.oper.impl.OperationAdd;
import com.janet.designpattern.factory.simplefactory.oper.impl.OperationSub;

/**
 * @Description 简单运算的工厂类，由于创建了四个加减乘除类和他们的父类，以后到底要实例化谁是不确定的，所以可以用工厂来解决这个问题。
 *              只要输入运算符号，工厂就会实例化出合适的对象，通过多态，返回了父类的方式实现了运算结果。
 * @Author Janet
 * @Date 2020/6/14
 */
public class OperationFactory {
    public static Operation createOperation(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
