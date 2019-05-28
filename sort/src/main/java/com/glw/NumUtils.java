package com.glw;

import java.util.Random;

/**
 * 排序工具类
 * Create by glw
 * 2019/5/28 15:00
 */
public class NumUtils {

    public static final int LENGTH = 30000;
    public static final int MAX = 10000000;

    /**
     * 获取随机int型整数
     * @param length
     * @param max
     * @return
     */
    public static int [] getRandomNums(int length, int max) {
        int nums[] = new int[length];
        Random random = new Random();
        for  (int i = 0; i < length; i++) {
            nums[i] = random.nextInt(max);
        }
        return nums;
    }

    /**
     * 打印结果
     * @param arr
     * @param position
     */
    public static void printResult(int arr[], boolean position) {
        if (position) {
            System.out.print("排序前：");
        } else {
            System.out.print("排序后：");
        }
        if (arr.length < 1) return;
        if (arr.length < 31) {
            for (int i : arr) {
                System.out.print(i + ", ");
            }
            System.out.println();
        } else {        // 只显示前10和后10位排序过的数
            int j = 0;
            for (int i : arr) {
                j++;
                if (j < 11) {
                    System.out.print(i + ", ");
                } else if (j == 11) {
                    System.out.print("... , ");
                } else if (j > arr.length - 11) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println();
        }
    }

    /**
     * 将数组索引为i的元素和索引为j的元素交换位置
     * @param arr
     * @param i
     * @param j
     */
    public static void exchange(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isNotNull(int arr[]) {
        if (arr == null || arr.length < 1) return false;
        return true;
    }
}
