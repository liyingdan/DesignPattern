package com.janet.simplefactorymode;

/**
 * @Description 把运算类单独提出来，降低业务逻辑与界面逻辑的耦合度
 * @Author Janet
 * @Date 2020/6/14
 */
public class Operation {
    // protected 修饰符是在类内部、同一个包中、子类中都可以访问
    protected int number1 = 0;
    protected int number2 = 0;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    //写一个获取运算结果的方法
    public int getResult(){
        int result = 0;
        return result;
    }
}
