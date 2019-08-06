package com.zyf.practice.designpattern.mediatorpattern;

import java.util.Date;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.mediatorpattern
 * @date 2019/8/6
 * 步骤 1
 * 创建中介类。
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
