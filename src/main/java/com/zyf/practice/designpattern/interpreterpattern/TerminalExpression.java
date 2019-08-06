package com.zyf.practice.designpattern.interpreterpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.interpreterpattern
 * @date 2019/8/5
 * 步骤 2
 * 创建实现了上述接口的实体类。
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
