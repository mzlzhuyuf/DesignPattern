package com.zyf.practice.designpattern.filterpattern;

import java.util.List;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.filterpattern
 * @date 2019/7/3
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(personList);
        List<Person> otherCriteriaItmes = otherCriteria.meetCriteria(personList);

        for (Person person : otherCriteriaItmes) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }

        return firstCriteriaItems;
    }
}
