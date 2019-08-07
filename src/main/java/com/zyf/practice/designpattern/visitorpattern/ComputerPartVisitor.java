package com.zyf.practice.designpattern.visitorpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.visitorpattern
 * @date 2019/8/7
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
