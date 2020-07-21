package com.zyf.practice.designpattern.commandpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.commandpattern
 * @date 2019/8/5
 * 步骤2
 * 创建一个请求类
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }
}
