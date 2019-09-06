package com.glw.design.principle.openclose;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : glw
 * @date : 2019/9/6
 * @time : 15:30
 * @Description : 开闭原则：测试类
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(96, "Java从入门到入土", 998D);
        log.info("课程ID：{}, 课程名称：{}, 课程价格：{}", javaCourse.getId(), javaCourse.getName(), javaCourse.getPrice());
    }
}
