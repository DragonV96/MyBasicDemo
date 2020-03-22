package com.glw.design.pattern.creational.simple_factory;

/**
 * @author : glw
 * @date : 2019/9/17
 * @time : 16:56
 * @Description : 简单工厂模式（非23种GOF）——创建型：python视频类
 */
public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制Python课程视频。");
    }
}
