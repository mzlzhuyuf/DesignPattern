package com.zyf.practice.designpattern.templatepattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.templatepattern
 * @date 2019/8/7
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
