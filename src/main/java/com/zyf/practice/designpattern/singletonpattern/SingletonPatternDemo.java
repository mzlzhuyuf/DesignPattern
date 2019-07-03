package com.zyf.practice.designpattern.singletonpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.singletonpattern
 * @date 2019/7/3
 * 2 从 singleton 类获取唯一的对象
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误，构造函数 SingleObject() 是不可见的
        //SingleObjecct object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();
        //显示消息
        object.showMessage();
    }
}
