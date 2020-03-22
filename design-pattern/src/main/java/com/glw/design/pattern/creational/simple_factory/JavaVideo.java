package com.glw.design.pattern.creational.simple_factory;

/**
 * @author : glw
 * @date : 2019/9/17
 * @time : 16:55
 * @Description : 简单工厂模式（非23种GOF）——创建型：java视频类
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制java课程视频。");
    }
}
