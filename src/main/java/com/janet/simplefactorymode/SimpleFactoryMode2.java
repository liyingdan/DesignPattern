package com.janet.simplefactorymode;

/**
 * @Description 一个面试题：请用 C++、Java、C# 或 VB.NET 任意一种面向对象语言实现一个计算器控制台程序，要求输入两个数和运算符号，得到结果。
 *              这是个比较好的解题思路，运用面向对象的三大特性和简单工程方法。这样以后就算要新增一个开跟的方法，也只需要新增一个开跟的类和
 *              修改运算工厂的方法，不用修改其他的方法了。
 * @Author Janet
 * @Date 2020/6/14
 */
public class SimpleFactoryMode2 {
    public static void main(String[] args) {
//        Operation operation = OperationFactory.createOperation("+");
//        operation.setNumber1(1);
//        operation.setNumber2(5);
//        int result = operation.getResult();
//        System.out.println("运算结果为："+result);

        Operation operation = OperationFactory.createOperation("/");
        operation.setNumber1(1);
        operation.setNumber2(0);
        int result = operation.getResult();
        System.out.println("运算结果为："+result);

    }
}
