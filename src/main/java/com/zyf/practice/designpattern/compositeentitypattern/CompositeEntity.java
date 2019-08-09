package com.zyf.practice.designpattern.compositeentitypattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.compositeentitypattern
 * @date 2019/8/9
 * 步骤 3
 * 创建组合实体。
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setDate(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getDate() {
        return cgo.getData();
    }
}
