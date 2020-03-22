package com.glw.design.principle.dependence_inversion;

/**
 * @author : glw
 * @date : 2019/9/9
 * @time : 9:15
 * @Description : 依赖倒置原则：web前端课程
 */
public class WebCourse implements ICourse{

    @Override
    public void course() {
        System.out.println("学生正在学习web前端课程。");
    }
}
