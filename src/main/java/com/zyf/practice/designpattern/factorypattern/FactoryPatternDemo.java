package com.zyf.practice.designpattern.factorypattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.factorypattern
 * @date 2019/7/2
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        Integer a = 130;
        int b = 130;
        System.out.println(!a.equals(b));
    }
}
