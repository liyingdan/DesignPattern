package com.janet.designpattern.decorator.decoratordemo;

/**
 * ConcreteComponent 类：一个具体的对象，实现 Component 接口。
 * @author Janet Li
 * @createTime 2022/11/18
 */
public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
