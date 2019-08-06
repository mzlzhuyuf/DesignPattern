package com.zyf.practice.designpattern.iteratorpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.iteratorpattern
 * @date 2019/8/6
 * 步骤 3
 * 使用 NameRepository 来获取迭代器，并打印名字。
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
