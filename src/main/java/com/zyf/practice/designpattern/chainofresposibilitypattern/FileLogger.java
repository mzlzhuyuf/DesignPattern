package com.zyf.practice.designpattern.chainofresposibilitypattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.chainofresposibilitypattern
 * @date 2019/8/5
 * 步骤 2
 * 创建扩展了该记录器类的实体类。
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
