package com.zyf.practice.designpattern.adapterpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.adapterpattern
 * 创建实现了 AdvancedMediaPlayer 接口的实体类
 * @date 2019/7/2
 */
public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
