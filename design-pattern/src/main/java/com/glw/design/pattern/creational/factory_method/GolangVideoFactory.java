package com.glw.design.pattern.creational.factory_method;

/**
 * @author : glw
 * @date : 2019/9/18
 * @time : 13:56
 * @Description : 工厂方法模式——创建型：golang视频工厂类
 */
public class GolangVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new GolangVideo();
    }
}
