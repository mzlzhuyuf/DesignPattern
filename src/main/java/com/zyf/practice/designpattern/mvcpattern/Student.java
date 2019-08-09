package com.zyf.practice.designpattern.mvcpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.mvcpattern
 * @date 2019/8/8
 * 步骤 1
 * 创建模型
 */
public class Student {
    private String rollNo;
    private String name;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
