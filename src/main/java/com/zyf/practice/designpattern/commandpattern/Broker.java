package com.zyf.practice.designpattern.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.commandpattern
 * @date 2019/8/5
 * 步骤4
 * 创建命令调用类
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void taskOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
    }
}
