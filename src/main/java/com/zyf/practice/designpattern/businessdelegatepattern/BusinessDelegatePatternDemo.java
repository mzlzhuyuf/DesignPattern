package com.zyf.practice.designpattern.businessdelegatepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.businessdelegatepattern
 * @date 2019/8/9
 * 步骤 6
 * 使用 BusinessDelegate 和 Client 类来演示业务代表模式。
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
