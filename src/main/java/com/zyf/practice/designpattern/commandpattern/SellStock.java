package com.zyf.practice.designpattern.commandpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.commandpattern
 * @date 2019/8/5
 * 步骤3
 * 创建实现了Order接口的实现类
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
