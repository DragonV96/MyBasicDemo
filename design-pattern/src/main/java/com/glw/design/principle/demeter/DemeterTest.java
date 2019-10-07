package com.glw.design.principle.demeter;

/**
 * @author : glw
 * @date : 2019/9/17
 * @time : 14:59
 * @Description : 迪米特原则：测试类
 */
public class DemeterTest {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
