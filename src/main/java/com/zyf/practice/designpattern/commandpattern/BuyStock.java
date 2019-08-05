package com.zyf.practice.designpattern.commandpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.commandpattern
 * @date 2019/8/5
 * 步骤3
 * 创建实现了Order接口的实体类
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
