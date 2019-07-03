package com.zyf.practice.designpattern.filterpattern;

import java.util.List;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.filterpattern
 * @date 2019/7/3
 * 步骤 2
 * 为标准（Criteria）创建一个接口。
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> personList);
}
