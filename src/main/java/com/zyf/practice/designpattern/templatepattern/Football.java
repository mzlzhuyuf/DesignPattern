package com.zyf.practice.designpattern.templatepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.templatepattern
 * @date 2019/8/7
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
