package com.janet.designpattern.proxy.proxydemo;

/**
 * Proxy类，保存一个引用使得代理可以访问实体，并提供一个与Subject的接口相同的接口，这样代理就可以用来代替实体。
 * @author Janet Li
 * @createTime 2022/11/18
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }

        realSubject.request();

    }
}
