package com.zyf.practice.designpattern.commandpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.commandpattern
 * @date 2019/8/5
 * 步骤 5
 * 使用 Broker 类来接受并执行命令。
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.taskOrder(buyStockOrder);
        broker.taskOrder(sellStockOrder);

        broker.placeOrders();
    }
}
