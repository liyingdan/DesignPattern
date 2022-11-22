package com.janet.designpattern.factory.simplefactory;

import lombok.Data;

/**
 * @Description 把运算类单独提出来，降低业务逻辑与界面逻辑的耦合度
 * @Author Janet
 * @Date 2020/6/14
 */
@Data
public abstract class Operation {
    // protected 修饰符是在类内部、同一个包中、子类中都可以访问
    protected int number1 = 0;
    protected int number2 = 0;

    //写一个获取运算结果的方法
    public abstract int getResult();
}
