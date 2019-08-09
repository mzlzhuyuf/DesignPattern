package com.zyf.practice.designpattern.businessdelegatepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.businessdelegatepattern
 * @date 2019/8/9
 * 步骤 4
 * 创建业务代表。
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
