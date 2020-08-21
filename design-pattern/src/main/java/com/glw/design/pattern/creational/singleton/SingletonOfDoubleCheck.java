package com.glw.design.pattern.creational.singleton;

/**
 * Create by glw
 * 2019/1/14 22:04
 * 单例模式是一种常用的软件设计模式，其定义是单例对象的类只能允许一个实例存在。
 * 单例模式要求类能够有返回对象一个引用(永远是同一个)和一个获得该实例的方法（必须是静态方法，通常使用getInstance这个名称）。
 *
 * 双重检查单例模式
 * 优点：线程安全；延迟加载；效率较高
 */
public class SingletonOfDoubleCheck {

    public static volatile SingletonOfDoubleCheck singleton;

    private SingletonOfDoubleCheck(){
    }

    public static SingletonOfDoubleCheck getInstance () {
        if (singleton == null) {    // 懒加载
            synchronized (SingletonOfDoubleCheck.class) {   // 保证线程安全
                if (singleton == null) {
                    singleton = new SingletonOfDoubleCheck();
                }
            }
        }
        return singleton;
    }
}
