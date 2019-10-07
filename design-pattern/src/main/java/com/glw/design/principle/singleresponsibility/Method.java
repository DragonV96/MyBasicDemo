package com.glw.design.principle.singleresponsibility;

/**
 * @author : glw
 * @date : 2019/9/9
 * @time : 17:32
 * @Description : 单一职责原则：更新方法类
 */
public class Method {

    public void updateUserInfo(String userName, String address) {
        userName = "小红";
        address = "巴黎";
    }

    private void updateUserInfo(String userName, String ... properties) {
        userName = "小红";
        // 可变属性
    }

    private void updateUserName(String userName) {
        userName = "小红";
    }

    private void updateUserAddress(String address) {
        address = "巴黎";
    }

}
