package com.glw.design.principle.single_responsibility;

/**
 * @author : glw
 * @date : 2019/9/9
 * @time : 17:31
 * @Description : 单一职责原则：课程实现类
 */
public class CourseImpl implements ICourseContent, ICourseManager {

    @Override
    public String courseName() {
        return null;
    }

    @Override
    public byte[] courseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
