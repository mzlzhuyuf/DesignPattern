package com.zyf.practice.designpattern.abstractfactorypattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.abstractfactorypattern
 * @date 2019/7/2
 * 创建实现接口的实体类
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
