package com.janet.designpattern.strategy.cashexample;

/**
 * @Description 正常收费子类
 * @Author Janet
 * @Date 2022-09-03
 */
public class CashNormal implements CashSuper {
    /**
     * 正常收费，原价返回
     * @param money  原价
     * @return
     */
    @Override
    public double acceptCash(double money) {
        return money;
    }
}