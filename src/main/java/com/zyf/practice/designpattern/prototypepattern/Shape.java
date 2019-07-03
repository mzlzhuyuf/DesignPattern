package com.zyf.practice.designpattern.prototypepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.prototypepattern
 * @date 2019/7/3
 * 步骤 1
 * 创建一个实现了 Clonable 接口的抽象类。
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
