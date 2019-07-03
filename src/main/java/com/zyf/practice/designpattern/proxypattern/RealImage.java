package com.zyf.practice.designpattern.proxypattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.proxypattern
 * @date 2019/7/3
 * 步骤 2
 * 创建实现接口的实体类。
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
