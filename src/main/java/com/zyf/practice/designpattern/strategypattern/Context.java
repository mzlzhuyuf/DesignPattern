package com.zyf.practice.designpattern.strategypattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.strategypattern
 * @date 2019/8/7
 * 步骤 3
 * 创建 Context 类。
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
