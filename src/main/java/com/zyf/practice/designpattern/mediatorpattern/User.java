package com.zyf.practice.designpattern.mediatorpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.mediatorpattern
 * @date 2019/8/6
 * 步骤 2
 * 创建user类。
 */
public class User {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
