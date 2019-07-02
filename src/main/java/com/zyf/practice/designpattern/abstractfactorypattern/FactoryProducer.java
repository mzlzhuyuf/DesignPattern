package com.zyf.practice.designpattern.abstractfactorypattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.abstractfactorypattern
 * @date 2019/7/2
 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
