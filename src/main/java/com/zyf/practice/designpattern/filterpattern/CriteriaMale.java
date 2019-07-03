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
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
