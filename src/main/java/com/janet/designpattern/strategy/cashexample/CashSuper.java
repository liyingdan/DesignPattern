package com.janet.designpattern.strategy.cashexample;

/**
 * @Description 现金收费的接口
 * @Author Janet
 * @Date 2022-09-03
 */
public interface CashSuper {
    /**
     * 现金收取类超类的抽象方法
     * @param money  原价
     * @return 当前价
     */
    double acceptCash(double money);
}