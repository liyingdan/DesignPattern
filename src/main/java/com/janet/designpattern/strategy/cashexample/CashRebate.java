package com.janet.designpattern.strategy.cashexample;

/**
 * @Description 打折收费子类
 * @Author Janet
 * @Date 2022-09-03
 */
public class CashRebate implements CashSuper {
    private double moneyRebate = 1d;

    /**
     * 打折收费，初始化时，必须要输入折扣率，如八折，就是0.8
     * @param moneyRebate 折扣率
     */
    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
