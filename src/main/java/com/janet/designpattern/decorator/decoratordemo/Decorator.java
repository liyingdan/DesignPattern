package com.janet.designpattern.decorator.decoratordemo;

/**
 * 装饰抽象类，实现了 Component 接口，从外类扩展 Component 的功能。
 * @author Janet Li
 * @createTime 2022/11/18
 */
public abstract class Decorator implements Component {
    protected Component component;

    /**
     * 把component初始化进来
     * @param component
     */
    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * 重写operation()，实际执行的是Component的operation()
     */
    @Override
    public void operation() {
        component.operation();
    }

}
