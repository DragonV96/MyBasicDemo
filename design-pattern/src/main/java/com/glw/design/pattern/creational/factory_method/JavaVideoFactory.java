package com.glw.design.pattern.creational.factory_method;

/**
 * @author : glw
 * @date : 2019/9/18
 * @time : 13:52
 * @Description : 工厂方法模式——创建型：java视频工厂抽象类
 */
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
