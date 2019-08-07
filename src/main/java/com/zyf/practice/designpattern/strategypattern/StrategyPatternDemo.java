package com.zyf.practice.designpattern.strategypattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.strategypattern
 * @date 2019/8/7
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " +context.executeStrategy(10, 5));
    }
}
