package com.zyf.practice.designpattern.proxypattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.proxypattern
 * @date 2019/7/3
 * 步骤 2
 * 创建实现接口的实体类。
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
