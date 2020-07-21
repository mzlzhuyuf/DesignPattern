package com.zyf.practice.designpattern.adapterpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.adapterpattern
 * 为媒体播放器和更高级的媒体播放器创建接口
 * @date 2019/7/2
 */
public interface AdvanceMediaPlayer {
    public void playVlc(String fileName);

    public void playMp4(String fileName);
}
