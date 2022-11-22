package com.janet.designpattern.prototype.prototypedemo;

import com.janet.designpattern.prototype.prototypedemo.ConcretePrototype;

/**
 * @author Janet Li
 * @createTime 2022/11/22
 */
public class Demo {
    public static void main(String[] args) {
        ConcretePrototype j1 = new ConcretePrototype("小J");
        //克隆 ConcretePrototype 的对象 j1 就能得到新的实例 c1
        ConcretePrototype c1 = (ConcretePrototype) j1.clone();

        System.out.println("cloned:" + c1.getId()); //cloned:小J
    }
}
