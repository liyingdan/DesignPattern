package com.janet.designpattern.proxy.example;

/**
 * @author Janet Li
 * @createTime 2022/11/18
 */
public class Demo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载（因为实例化的时候已经加载过了）
        image.display();
    }
}
