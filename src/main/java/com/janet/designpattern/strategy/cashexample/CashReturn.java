package com.janet.designpattern.strategy.cashexample;

/**
 * @Description 返利收费子类
 * @Author Janet
 * @Date 2022-09-03
 */
public class CashReturn implements CashSuper {
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    /**
     * 返利收费，初始化时必须要输入返利条件和返利值，比如满300返50，则moneyCondition = 300，moneyReturn = 50。
     *
     * @param moneyCondition 返利条件
     * @param moneyReturn    返利值
     */
    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            //若大于返利条件，则需要减去返利值
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
