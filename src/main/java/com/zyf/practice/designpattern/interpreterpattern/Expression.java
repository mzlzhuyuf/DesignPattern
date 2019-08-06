package com.zyf.practice.designpattern.interpreterpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.interpreterpattern
 * @date 2019/8/5
 * 步骤1
 * 创建一个表达式接口。
 */
public interface Expression {
    public boolean interpret(String context);
}
