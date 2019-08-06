package com.zyf.practice.designpattern.observerpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.observerpattern
 * @date 2019/8/6
 * 步骤 4
 * 使用 Subject 和实体观察者对象。
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
