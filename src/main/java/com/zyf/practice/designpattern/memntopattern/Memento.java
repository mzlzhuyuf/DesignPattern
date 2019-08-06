package com.zyf.practice.designpattern.memntopattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.memntopattern
 * @date 2019/8/6
 * 步骤 1
 * 创建 Memento 类。
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
