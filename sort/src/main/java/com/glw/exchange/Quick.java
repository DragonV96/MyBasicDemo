package com.glw.exchange;

import com.glw.NumUtils;

/**
 * 快速排序
 * @author glw
 * @date 2019/5/29 13:52
 */
public class Quick {

    public static void quick(int arr[], int left, int right) {
        if (!NumUtils.isNotNull(arr)) return;
        if (left > right) return;   // 左索引大于右索引时直接返回
        int i = left;       // 左索引
        int j = right;      // 右索引
        int temp = arr[left];           // 左索引的值作为标准值
        while (i != j) {
            // 右索引对应元素大于标准值则索引左移,继续寻找小于它的值
            while (i < j && arr[j] >= temp) {
                j--;
            }
            // 左索引对应元素大于标准值则索引右移,继续寻找大于它的值
            while (i < j && arr[i] <= temp) {
                i++;
            }
            // 找到后交换位置
            if (i < j) {
                NumUtils.exchange(arr, i, j);
            }
        }
        // 左索引与右索引相遇时交换位置
        NumUtils.exchange(arr, left, i);
        // 进入下一个循环
        quick(arr, left, i - 1);
        quick(arr, j + 1, right);


    }

    public static void main(String[] args) {
        int arr[] = NumUtils.getRandomNums(NumUtils.LENGTH, NumUtils.MAX);
        NumUtils.printResult(arr, true);
        long startTime=System.currentTimeMillis();
        quick(arr, 0, arr.length - 1);                   // 排序
        long endTime=System.currentTimeMillis();
        NumUtils.printResult(arr, false);
        System.out.println("排序用时："+(endTime-startTime)+"毫秒");
    }
}
