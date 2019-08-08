package com.zyf.practice.designpattern.visitorpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.visitorpattern
 * @date 2019/8/8
 * 步骤 5
 * 使用 ComputerPartDisplayVisitor 来显示 Computer 的组成部分。
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();

        computer.accept(new ComputerPartDisplayVisitor());
    }
}
