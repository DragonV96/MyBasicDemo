package com.glw.design.principle.dependenceinversion;

/**
 * @author : glw
 * @date : 2019/9/9
 * @time : 9:15
 * @Description : 依赖倒置原则：java课程
 */
public class JavaCourse implements ICourse{

    @Override
    public void course() {
        System.out.println("学生正在学习java课程。");
    }
}
