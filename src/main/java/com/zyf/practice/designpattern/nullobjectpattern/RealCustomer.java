package com.zyf.practice.designpattern.nullobjectpattern;

//步骤 2
//创建扩展了上述类的实体类。
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
