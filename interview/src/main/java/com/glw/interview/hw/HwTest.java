package com.glw.interview.hw;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : glw
 * @date : 2020/4/12
 * @time : 22:25
 * @Description : hw 笔试题
 * 输入一组字符串，替换字符串中的 数字、下划线和符号，将字符串中的连续的英文字母首字母大写，多个连续英文字母之间间隔一个空格（首部无空格），以英文句号结尾。
 * 如：
 * 输入：?^^%$^%
 * 输出：.
 * 输入：----Who,love???Solo
 * 输出：Who Love Solo.
 * 输入：WHO lOve?, SOUL
 * 输出：Who Love Soul.
 */
public class HwTest {

    private static boolean isValid(char c) {
        return (c <= 90 && c >= 65) || (c <= 122 && c >= 97);
    }

    private static void test(String n) {
        if (n == null) {
            System.out.println(".");
            return;
        }
        int first = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            char current = n.charAt(i);
            if (isValid(current)) {
                if (first == 0) {
                    sb.append(" ");
                    sb.append(Character.toUpperCase(current));
                    first++;
                } else {
                    sb.append(Character.toLowerCase(current));
                }
            } else {
                first = 0;
            }
        }
        sb.append(".");
        System.out.println(sb.toString().replaceFirst(" ", ""));
    }

    /**
     * A-Z 65-90
     * a-z 97-122
     * . 46
     * @param args
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String n = "?^^%$^%";
        List<String> list = new ArrayList<>();
        list.add("?^^%$^%");
        list.add("Who love?, Sol");
        list.add("----Who,love???Solo");
        list.add("~hello.8world...");
        list.add("?^^%$date time^%");
        list.add("WHO lOve?, SOUL");
        list.add("");
        list.add(null);

        long start = System.currentTimeMillis();
        for (String str : list) {
            test(str);
        }

        DecimalFormat df = new DecimalFormat("#.###");
        long duration = System.currentTimeMillis() - start;
        System.out.println("总时长 = " + duration + "ms");
        System.out.println("平均时长 = " + df.format((double) duration / list.size()) + "ms");
    }
}
