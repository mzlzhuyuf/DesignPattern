package com.zyf.practice.designpattern.statepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.statepattern
 * @date 2019/8/6
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
