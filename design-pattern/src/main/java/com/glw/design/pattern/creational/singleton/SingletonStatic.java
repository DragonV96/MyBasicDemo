package com.glw.design.pattern.creational.singleton;

/**
 * Create by glw
 * 2019/1/14 22:18
 * 静态内部类单例模式
 * 优点：避免了线程不安全，按需加载，效率高。
 */
public class SingletonStatic {

    private SingletonStatic () {}

    private static class Singleton{
        private static final SingletonStatic INSTANCE = new SingletonStatic();
    }

    public SingletonStatic getInstance () {
        return Singleton.INSTANCE;
    }

}
