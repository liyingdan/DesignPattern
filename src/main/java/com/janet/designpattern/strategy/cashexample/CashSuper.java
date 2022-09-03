package com.janet.designpattern.strategy.cashexample;

/**
 * @Description 现金收费的抽象类
 * @Author Janet
 * @Date 2022-09-03
 */
abstract class CashSuper {
    /**
     * 现金收取类超类的抽象方法
     * @param money  原价
     * @return 当前价
     */
    public abstract double acceptCash(double money);
}
