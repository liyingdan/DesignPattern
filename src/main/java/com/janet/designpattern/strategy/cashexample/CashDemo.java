package com.janet.designpattern.strategy.cashexample;

/**
 * @Description 客户端代码
 * @Author Janet
 * @Date 2022-09-03
 */
public class CashDemo {
    public static void main(String[] args) {
        CashContext csuper = new CashContext("打八折");
        // 计算最终价格，单价200，数量为2
        double totalPrice = csuper.GetResult(200 * 2);
        System.out.println("商品最终价格为：" + totalPrice); //320.0

        CashContext csuper1 = new CashContext("满300返50");
        double totalPrice1 = csuper1.GetResult(400 * 2);
        System.out.println("商品最终价格为：" + totalPrice1); // 700.0
    }
}
