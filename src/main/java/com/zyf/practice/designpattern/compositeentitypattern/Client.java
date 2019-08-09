package com.zyf.practice.designpattern.compositeentitypattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.compositeentitypattern
 * @date 2019/8/9
 * 步骤 4
 * 创建使用组合实体的客户端类。
 */
public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for (int i = 0; i < compositeEntity.getDate().length; i++) {
            System.out.println("Data: " + compositeEntity.getDate()[i]);
        }
    }

    public void setData(String data1, String data2) {
        compositeEntity.setDate(data1, data2);
    }
}
