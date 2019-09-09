package com.glw.design.principle.dependenceinversion;

/**
 * @author : glw
 * @date : 2019/9/9
 * @time : 9:17
 * @Description : 依赖倒置原则：
 */
public class DependenceInversionTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.setCourse(new JavaCourse());
        student.studyCourse();

        student.setCourse(new PythonCourse());
        student.studyCourse();

        student.setCourse(new WebCourse());
        student.studyCourse();
    }

}
