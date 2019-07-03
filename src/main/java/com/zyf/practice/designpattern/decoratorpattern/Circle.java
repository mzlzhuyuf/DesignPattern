package com.zyf.practice.designpattern.decoratorpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.decoratorpattern
 * @date 2019/7/3
 * 步骤 2
 * 创建实现接口的实体类。
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
