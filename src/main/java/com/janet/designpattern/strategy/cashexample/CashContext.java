package com.janet.designpattern.strategy.cashexample;

/**
 * @Description CashContext 类
 * @Author Janet
 * @Date 2022-09-03
 */
public class CashContext {
    //声明一个CashSuper对象
    private CashSuper cs;

    /**
     * 通过构造方法，传入具体的收费策略
     * @param csuper
     */
//    public CashContext(CashSuper csuper){
//        this.cs = csuper;
//    }

    /**
     * 这里结合简单工厂的应用，将实例化具体策略过程由客户端转移到context中。所以这里的参数不是具体的收费策略对象，而是一个字符串，表示收费类型
     * @param type 收费类型
     */
    public CashContext(String type){
        switch (type){
            case "正常收费":
                CashNormal cs0 = new CashNormal();
                cs = cs0;
                break;
            case "满300返50":
                CashReturn cs1 = new CashReturn("300", "50");
                cs = cs1;
                break;
            case "打八折":
                CashRebate cs2 = new CashRebate("0.8");
                cs = cs2;
                break;

        }
    }

    public double GetResult(double money){
        return cs.acceptCash(money);
    }
}
