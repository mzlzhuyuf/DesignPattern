package com.zyf.practice.designpattern.statepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.statepattern
 * @date 2019/8/6
 * 步骤 3
 * 创建 Context 类。
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
