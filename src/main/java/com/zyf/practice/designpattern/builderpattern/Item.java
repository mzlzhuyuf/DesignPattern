package com.zyf.practice.designpattern.builderpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.builderpattern
 * @date 2019/7/2
 * 创建一个表示食物条目和食物包装的接口
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
