package com.zyf.practice.designpattern.compositeentitypattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.compositeentitypattern
 * @date 2019/8/9
 * 步骤 5
 * 使用 Client 来演示组合实体设计模式的用法。
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
