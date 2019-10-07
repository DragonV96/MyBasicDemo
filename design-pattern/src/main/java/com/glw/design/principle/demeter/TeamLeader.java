package com.glw.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : glw
 * @date : 2019/9/16
 * @time : 10:40
 * @Description : 迪米特原则：技术总监类
 */
public class TeamLeader {

    public void checkNumberOfCourses(){
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是：" + courseList.size());
    }
}
