package com.glw.exchange;

import com.glw.NumUtils;

/**
 * 冒泡排序
 * @author glw
 * @date 2019/5/29 12:48
 */
public class Bubble {

    public static void bubble(int arr[]) {
        if (!NumUtils.isNotNull(arr)) return;
        int length = arr.length - 1;
        for (int i = 0; i < length; i++) {
            // 每次循环找出最大值,则下一次循环无需再遍历上一次的最大值
            for (int j = 0; j < length - i; j++) {
                if (arr[j] > arr[j + 1]) {      // 前面的数比后面的数大则交换位置
                    NumUtils.exchange(arr, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = NumUtils.getRandomNums(NumUtils.LENGTH, NumUtils.MAX);
        NumUtils.printResult(arr, true);
        long startTime=System.currentTimeMillis();
        bubble(arr);                   // 排序
        long endTime=System.currentTimeMillis();
        NumUtils.printResult(arr, false);
        System.out.println("排序用时："+(endTime-startTime)+"毫秒");
    }
}
