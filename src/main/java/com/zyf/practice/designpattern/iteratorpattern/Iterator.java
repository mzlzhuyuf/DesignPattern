package com.zyf.practice.designpattern.iteratorpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.iteratorpattern
 * @date 2019/8/6
 * 步骤1 创建接口
 */
public interface Iterator {
    public boolean hasNext();
    public Object next();
}
