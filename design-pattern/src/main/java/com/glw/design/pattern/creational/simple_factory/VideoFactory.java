package com.glw.design.pattern.creational.simple_factory;

/**
 * @author : glw
 * @date : 2019/9/17
 * @time : 17:00
 * @Description : 简单工厂模式（非23种GOF）——创建型：视频工厂类
 */
public class VideoFactory {

    /**
     * 通过反射获取对象
     * @param clazz
     * @return
     */
    public Video getVideo(Class clazz){
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

    public Video getVideo(String type){
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }
}
