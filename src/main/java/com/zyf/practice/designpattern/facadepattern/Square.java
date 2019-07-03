package com.zyf.practice.designpattern.facadepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.facadepattern
 * @date 2019/7/3
 * 步骤 2
 * 创建实现接口的实体类。
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
