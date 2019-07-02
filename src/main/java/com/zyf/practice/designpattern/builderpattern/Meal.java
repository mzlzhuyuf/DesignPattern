package com.zyf.practice.designpattern.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.builderpattern
 * @date 2019/7/2
 * 创建一个 Meal 类，带有上面定义的 Item 对象
 */
public class Meal {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : itemList) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : itemList) {
            System.out.print("Item: " + item.name());
            System.out.print(", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        }
    }
}
