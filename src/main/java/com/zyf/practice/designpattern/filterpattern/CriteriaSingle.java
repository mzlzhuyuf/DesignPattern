package com.zyf.practice.designpattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.filterpattern
 * @date 2019/7/3
 * 步骤 3
 * 创建实现了 Criteria 接口的实体类。
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
