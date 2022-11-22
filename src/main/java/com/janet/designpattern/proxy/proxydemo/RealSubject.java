package com.janet.designpattern.proxy.proxydemo;

/**
 * RealSubject实体类，定义Proxy所代表的正式实体。
 * @author Janet Li
 * @createTime 2022/11/18
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
