package com.glw.design.pattern.creational.factorymethod;

/**
 * @author : glw
 * @date : 2019/9/17
 * @time : 16:56
 * @Description : 工厂方法模式——创建型：python视频类
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频。");
    }
}
