package com.zyf.practice.designpattern.strategypattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.strategypattern
 * @date 2019/8/7
 * 步骤 2
 * 创建实现接口的实体类。
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
