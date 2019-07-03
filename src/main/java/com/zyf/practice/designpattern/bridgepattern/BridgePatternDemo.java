package com.zyf.practice.designpattern.bridgepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.bridgepattern
 * @date 2019/7/3
 * 步骤 5
 * 使用 Shape 和 DrawAPI 类画出不同颜色的圆。
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
