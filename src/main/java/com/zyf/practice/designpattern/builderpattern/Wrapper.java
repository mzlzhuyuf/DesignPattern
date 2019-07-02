package com.zyf.practice.designpattern.builderpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.builderpattern
 * @date 2019/7/2
 * 创建实现 Packing 接口的实体类
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
