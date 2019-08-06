package com.zyf.practice.designpattern.mediatorpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.mediatorpattern
 * @date 2019/8/6
 * 步骤 3
 * 使用 User 对象来显示他们之间的通信。
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi John");
        john.sendMessage("Hello! Robert!");
    }
}
