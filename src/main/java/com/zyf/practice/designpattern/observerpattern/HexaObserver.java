package com.zyf.practice.designpattern.observerpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.observerpattern
 * @date 2019/8/6
 * 步骤 3
 * 创建实体观察者类。
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
    }
}
