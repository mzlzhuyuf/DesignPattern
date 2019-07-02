package com.zyf.practice.designpattern.builderpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.builderpattern
 * @date 2019/7/2
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
