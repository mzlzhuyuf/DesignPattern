package com.zyf.practice.designpattern.observerpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.observerpattern
 * @date 2019/8/6
 * 步骤 2
 * 创建 Observer 类。
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
