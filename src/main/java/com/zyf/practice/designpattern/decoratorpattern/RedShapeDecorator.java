package com.zyf.practice.designpattern.decoratorpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.decoratorpattern
 * @date 2019/7/3
 * 步骤 4
 * 创建扩展了 ShapeDecorator 类的实体装饰类。
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
