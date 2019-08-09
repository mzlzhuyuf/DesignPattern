package com.zyf.practice.designpattern.businessdelegatepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.businessdelegatepattern
 * @date 2019/8/9
 * 步骤 3
 * 创建业务查询服务。
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSSerivce();
        }
    }
}
