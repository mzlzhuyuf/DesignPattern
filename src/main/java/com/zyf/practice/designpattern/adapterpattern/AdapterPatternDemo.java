package com.zyf.practice.designpattern.adapterpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.adapterpattern
 * @date 2019/7/2
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
