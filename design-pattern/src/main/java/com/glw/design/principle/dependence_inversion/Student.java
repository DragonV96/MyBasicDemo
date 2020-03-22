package com.glw.design.principle.dependence_inversion;

/**
 * @author : glw
 * @date : 2019/9/9
 * @time : 9:13
 * @Description : 依赖倒置原则：学生类
 */
public class Student {

    private ICourse iCourse;

    public void setCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.course();
    }

}
