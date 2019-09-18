package com.glw.design.pattern.creational.factorymethod;

/**
 * @author : glw
 * @date : 2019/9/18
 * @time : 13:50
 * @Description : 工厂方法模式——创建型：python视频工厂抽象类
 */
public class PythonVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
