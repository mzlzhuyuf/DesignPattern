package com.zyf.practice.designpattern.filterpattern;

import java.util.List;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.filterpattern
 * @date 2019/7/3
 * 步骤 3
 * 创建实现了 Criteria 接口的实体类。
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(personList);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
