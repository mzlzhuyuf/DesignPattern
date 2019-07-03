package com.zyf.practice.designpattern.decoratorpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.decoratorpattern
 * @date 2019/7/3
 * 步骤 3
 * 创建实现了 Shape 接口的抽象装饰类。
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
