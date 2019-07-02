package com.zyf.practice.designpattern.builderpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.builderpattern
 * @date 2019/7/2
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChinkenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
