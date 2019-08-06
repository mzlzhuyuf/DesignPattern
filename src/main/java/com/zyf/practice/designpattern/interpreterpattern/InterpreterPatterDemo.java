package com.zyf.practice.designpattern.interpreterpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.interpreterpattern
 * @date 2019/8/5
 * 步骤 3
 * InterpreterPatternDemo 使用 Expression 类来创建规则，并解析它们。
 */
public class InterpreterPatterDemo {
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarridWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarridWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
