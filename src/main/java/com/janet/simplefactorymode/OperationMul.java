package com.janet.simplefactorymode;

/**
 * @Description 乘法类，继承运算类 Operation 以及重写方法 getResult
 * @Author Janet
 * @Date 2020/6/14
 */
public class OperationMul extends Operation {
    @Override
    public int getResult(){
        int result = 0;
        result = number1 * number2;
        return result;
    }
}
