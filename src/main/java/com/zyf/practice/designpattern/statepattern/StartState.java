package com.zyf.practice.designpattern.statepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.statepattern
 * @date 2019/8/6
 * 步骤 2
 * 创建实现接口的实体类。
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "State State";
    }
}
