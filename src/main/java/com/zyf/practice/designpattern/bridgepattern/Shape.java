package com.zyf.practice.designpattern.bridgepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.bridgepattern
 * @date 2019/7/3
 * 步骤 3
 * 使用 DrawAPI 接口创建抽象类 Shape。
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
