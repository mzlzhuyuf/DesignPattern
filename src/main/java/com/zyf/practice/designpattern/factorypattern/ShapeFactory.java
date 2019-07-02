package com.zyf.practice.designpattern.factorypattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.factorypattern
 * @date 2019/7/2
 * 创建一个工厂，生成基于给定信息的实体类的对象
 */
public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeTpye) {
        if (shapeTpye == null) {
            return null;
        }
        if (shapeTpye.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeTpye.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeTpye.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
