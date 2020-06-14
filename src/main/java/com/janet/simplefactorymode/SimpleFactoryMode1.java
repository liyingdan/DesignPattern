package com.janet.simplefactorymode;

import java.util.Scanner;

/**
 * @Description 一个面试题：请用 C++、Java、C# 或 VB.NET 任意一种面向对象语言实现一个计算器控制台程序，要求输入两个数和运算符号，得到结果。
 *              然后这是一个粗暴的方法，不值得提倡，正解请看下一个方法
 * @Author Janet
 * @Date 2020/6/14
 */
public class SimpleFactoryMode1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第一个数：");
            int num1 = scanner.nextInt();
            System.out.println("请输入运算符：");
            String operate = scanner.next();
            System.out.println("请输入第二个数：");
            int num2 = scanner.nextInt();

            int result = 0;

            switch (operate){
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if(num2 != 0)
                        result = num1 / num2;
                     else
                         throw new RuntimeException("除数不能为0");
                    break;
            }

            System.out.println("运算结果为："+result);

        } catch (Exception e) {
            throw new RuntimeException("您的输入有误："+e.getMessage());
        }

    }

}
