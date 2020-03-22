package com.glw.design.pattern.creational.simple_factory;

/**
 * @author : glw
 * @date : 2019/9/17
 * @time : 16:59
 * @Description : 简单工厂模式（非23种GOF）——创建型：
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
