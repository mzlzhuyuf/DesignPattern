package com.zyf.practice.designpattern.templatepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.templatepattern
 * @date 2019/8/7
 * 步骤 2
 * 创建扩展了上述类的实体类。
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
