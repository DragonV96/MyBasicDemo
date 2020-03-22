package com.glw.design.pattern.creational.factory_method;

/**
 * @author : glw
 * @date : 2019/9/17
 * @time : 16:59
 * @Description : 工厂方法模式——创建型：测试类
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory2 = new PythonVideoFactory();
        VideoFactory videoFactory3 = new GolangVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
