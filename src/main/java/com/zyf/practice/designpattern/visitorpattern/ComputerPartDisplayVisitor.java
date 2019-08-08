package com.zyf.practice.designpattern.visitorpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.visitorpattern
 * @date 2019/8/8
 * 步骤 4
 * 创建实现了上述类的实体访问者。
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
