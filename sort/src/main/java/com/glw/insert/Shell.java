package com.glw.insert;

import com.glw.NumUtils;

/**
 * 希尔排序
 * Create by glw
 * 2019/5/28 17:19
 */
public class Shell {

    public static void shell(int arr[]) {
        if (!NumUtils.isNotNull(arr)) return;
        int length = arr.length;
        int block = 3;      // 分块大小（大于1即可）
        int h = 1;          // 分块后每块元素数量
        while (h < length / block) {        // 取分块后每块最大元素数量
            h = block * h + 1;      // 分块大小为3时，h分别为1, 4, 13, 40...
        }
        while (h >= 1) {
            int n, i, j, k;
            // 分块后产生n个子块
            for (n = 0; n < h; n++) {
                for (i = n + h; i < length; i += h) {
                    for (j = i - h; j >= 0 && arr[i] < arr[j]; j -= h) {
                    }
                    int temp = arr[i];
                    for (k = i; k > j + h; k -= h) {
                        arr[k] = arr[k - h];
                    }
                    arr[j + h] = temp;
                }
            }
            // 直接插入排序完后，减少每块中的元素，即增大块区的数量，直到h为1，即每个块区只有一个元素时排序结束
            h = h / block;
        }
    }

    public static void main(String[] args) {
        int arr[] = NumUtils.getRandomNums(NumUtils.LENGTH, NumUtils.MAX);
        NumUtils.printResult(arr, true);
        long startTime=System.currentTimeMillis();
        shell(arr);                   // 排序
        long endTime=System.currentTimeMillis();
        NumUtils.printResult(arr, false);
        System.out.println("排序用时："+(endTime-startTime)+"毫秒");
    }
}
