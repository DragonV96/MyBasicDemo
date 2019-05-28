package com.glw.select;

import com.glw.NumUtils;

/**
 * 简单选择排序
 * Create by glw
 * 2019/5/28 20:54
 */
public class SimpleSelection {

    public static void simpleSelection(int arr[]) {
        if (!NumUtils.isNotNull(arr)) return;
        int length = arr.length;
        // 循环比较，若数组长度为5，则循环4次。
        // 第一次循环有5个数，将其中的最小值位置与第一位交换。
        // 第二次循环有4个数，将其中的最小值位置与第一位交换，以此类推。
        for (int i = 0; i < length; i++) {
            // 保存每次循环最小值数组索引，第一次循环设第一个数字为最小值
            int minIndex = i;
            // 循环取出最小值
            for (int j = i + 1; j < length; j ++) {
                if (arr[j] < arr[minIndex]) {       // 保存这波循环的最小值索引
                    minIndex = j;
                }
            }
            // 第一个元素与最小值的元素交换位置
            NumUtils.exchange(arr, i, minIndex);
        }
    }

    public static void main(String[] args) {
        int arr[] = NumUtils.getRandomNums(NumUtils.LENGTH, NumUtils.MAX);
        NumUtils.printResult(arr, true);
        long startTime=System.currentTimeMillis();
        simpleSelection(arr);                   // 排序
        long endTime=System.currentTimeMillis();
        NumUtils.printResult(arr, false);
        System.out.println("排序用时："+(endTime-startTime)+"毫秒");
    }
}
