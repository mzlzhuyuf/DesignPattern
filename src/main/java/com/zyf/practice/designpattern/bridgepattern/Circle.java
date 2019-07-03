package com.zyf.practice.designpattern.bridgepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.bridgepattern
 * @date 2019/7/3
 * 步骤 4
 * 创建实现了 Shape 接口的实体类。
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
