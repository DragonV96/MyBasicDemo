package com.glw.design.pattern.creational.factorymethod;

/**
 * @author : glw
 * @date : 2019/9/18
 * @time : 13:55
 * @Description : 工厂方法模式——创建型：golang视频类
 */
public class GolangVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制golang课程视频。");
    }
}
