package com.zyf.practice.designpattern.businessdelegatepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.businessdelegatepattern
 * @date 2019/8/9
 * 步骤 2
 * 创建实体服务类。
 */
public class JMSSerivce implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
