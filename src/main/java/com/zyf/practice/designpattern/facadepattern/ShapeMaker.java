package com.zyf.practice.designpattern.facadepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.facadepattern
 * @date 2019/7/3
 * 步骤 3
 * 创建一个外观类。
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangel();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }
    public void drawRectangle() {
        rectangle.draw();
    }
    public void drawSquare() {
        square.draw();
    }
}
