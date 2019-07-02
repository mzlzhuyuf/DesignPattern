package com.zyf.practice.designpattern.abstractfactorypattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.abstractfactorypattern
 * @date 2019/7/2
 * 创建实现接口的实体类
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Recangle::draw() method.");
    }
}
