package com.zyf.practice.designpattern.bridgepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.bridgepattern
 * @date 2019/7/3
 * 步骤 2
 * 创建实现了 DrawAPI 接口的实体桥接实现类。
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
