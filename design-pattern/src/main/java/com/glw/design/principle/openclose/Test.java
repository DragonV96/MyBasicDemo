package com.glw.design.principle.openclose;

/**
 * @author : glw
 * @date : 2019/9/6
 * @time : 15:30
 * @Description : 开闭原则：测试类
 */
public class Test {

    public static void main(String[] args) {
        ICourse course = new JavaDiscountCourse(96, "Java从入门到入土", 998D);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse)course;
        System.out.println("课程ID：" + javaCourse.getId() + ", 课程名称：" + javaCourse.getName() + ", 课程折后价格：" + javaCourse.getPrice() + "元, 课程价格：" + javaCourse.getOriginPrice() + "元");
    }
}
