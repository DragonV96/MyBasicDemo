package com.glw;

/**
 * Create by glw
 * 2019/1/20 20:53
 * 输出：println()方法、printf()方法与format()方法
 */
public class PrintOfString {
    public static void main(String[] args) {
        int i = 5;
        double j = 5.666;
        // println()方法
        System.out.println("坐标 (" + i + ", " + j + ")");
        // printf()方法
        System.out.printf("坐标 (%d, %f)\n", i, j);
        // format()方法
        System.out.format("坐标 (%d, %f)", i, j);
    }
}
