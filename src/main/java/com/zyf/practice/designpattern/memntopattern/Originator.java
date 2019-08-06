package com.zyf.practice.designpattern.memntopattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.memntopattern
 * @date 2019/8/6
 * 步骤 2
 * 创建 Originator 类。
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
