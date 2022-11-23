package com.janet.designpattern.proxy.proxydemo;

/**
 * 接口，定义了RealSubject和Proxy的共用接口，这样就可以在任何使用RealSubject的地方都可以使用Proxy
 * @author Janet Li
 * @createTime 2022/11/18
 */
public interface Subject {
    void request();
}
