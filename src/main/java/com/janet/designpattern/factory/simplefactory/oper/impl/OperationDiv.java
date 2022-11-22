package com.janet.designpattern.factory.simplefactory.oper.impl;

import com.janet.designpattern.factory.simplefactory.Operation;

/**
 * @Description 除法类，继承运算类 Operation 以及重写方法 getResult
 * @Author Janet
 * @Date 2020/6/14
 */
public class OperationDiv extends Operation {
    @Override
    public int getResult(){
        int result = 0;
        if(number2 == 0)
            throw new RuntimeException("除数不能为0");
        result = number1 / number2;
        return result;
    }
}
