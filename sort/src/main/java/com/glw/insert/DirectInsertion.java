package com.glw.insert;

import com.glw.NumUtils;

/**
 * 直接插入排序
 * Create by glw
 * 2019/5/28 14:59
 */
public class DirectInsertion {

    public static void directInsertionSort(int arr[]) {
        if (!NumUtils.isNotNull(arr)) return;
        int length = arr.length;
        int i = 1, j = 0;
        for (i = 1; i < length; i++) {      // 向已排序的数组中插入arr[i]
            for (j = i - 1; j >= 0 && arr[i] < arr[j]; j--) {   // 当arr[i]小于arr[j]时，j继续向前移动，直到arr[i]大于arr[j]
            }
            int temp = arr[i];      // 临时存放arr[i]
            // 将j到i范围的数组元素整体向后移动一个位置
            for (int k = i; k > j + 1; k--) {
                arr[k] = arr[k - 1];
            }
            // 将arr[i]插在j的下一个位置
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = NumUtils.getRandomNums(NumUtils.LENGTH, NumUtils.MAX);
        NumUtils.printResult(arr, true);
        long startTime=System.currentTimeMillis();
        directInsertionSort(arr);                   // 排序
        long endTime=System.currentTimeMillis();
        NumUtils.printResult(arr, false);
        System.out.println("排序用时："+(endTime-startTime)+"毫秒");
    }
}
