package com.glw.design.principle.demeter;

/**
 * @author : glw
 * @date : 2019/9/16
 * @time : 10:39
 * @Description : 迪米特原则：老板类
 */
public class Boss {

    /**
     * 检查课程数量
     * @param teamLeader
     */
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }
}
