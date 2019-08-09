package com.zyf.practice.designpattern.businessdelegatepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.businessdelegatepattern
 * @date 2019/8/9
 * 步骤 5
 * 创建客户端。
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
