package com.zyf.practice.designpattern.memntopattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.memntopattern
 * @date 2019/8/6
 * 步骤 3
 * 创建 CareTaker 类。
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
