package com.zyf.practice.designpattern.nullobjectpattern;

/**
 * 步骤 2
 * 创建扩展了上述类的实体类。
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
