package com.zyf.practice.designpattern.facadepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.facadepattern
 * @date 2019/7/3
 * 步骤 4
 * 使用该外观类画出各种类型的形状。
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
