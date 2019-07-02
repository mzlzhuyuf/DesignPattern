package com.zyf.practice.designpattern.builderpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.builderpattern
 * @date 2019/7/2
 * 创建扩展了 Burger 和 ColdDrink 的实体类
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
