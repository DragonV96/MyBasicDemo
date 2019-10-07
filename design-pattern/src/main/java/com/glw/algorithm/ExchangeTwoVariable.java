package com.glw.algorithm;

/**
 * @author : glw
 * @date : 2019/9/27
 * @time : 17:03
 * @Description : 交换两个数值：运用异或运算符 ^ ，空间复杂度为O(1)，时间复杂度为O(n)
 */
public class ExchangeTwoVariable {

    public static void exchange(int x, int y) {
        x = x ^ y;
        System.out.println("第一次交换后，x=" + x + "，y=" + y + "\nx = " + x + " ^ " + y);
        y = x ^ y;
        System.out.println("第二次交换后，x=" + x + "，y=" + y + "\nx = " + x + " ^ " + y);
        x = x ^ y;
        System.out.println("最后交换后，x=" + x + "，y=" + y);
    }

    public static void main(String[] args) {
        int x = 9, y = 60;
        System.out.println("交换前，x=" + x + "，y=" + y + "\nx = " + x + " ^ " + y);
        exchange(x, y);
    }
}
