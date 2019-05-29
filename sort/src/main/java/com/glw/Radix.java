package com.glw;


/**
 * 基数排序
 * Create by glw
 * 2019/5/29 16:33
 */
public class Radix {

    public  static int[] radix(int[] arr, int d) {  // d表示最大位数
        if (!NumUtils.isNotNull(arr)) return null;
        int length = arr.length;
        int n = 1;      // 代表位数对应的数值（个十百千）
        int k = 0;      // 保存每一位排序后的结果用于下一位的输入
        // 排序桶用于保存每次排序后的结果，这一位上排序结果相同的数字放在同一个桶里
        int[][] bucket = new int[10][length];
        int[] order = new int[length];  // 用于保存每个桶里有多少个值
        while (n < d) {
            for (int num : arr) {   // 将数组里的每个数字放在相应的桶里
                int digit = (num / n) % 10;
                bucket[digit][order[digit]] = num;
                order[digit]++;
            }
            // 将上一个循环生成的桶里的数据覆盖到原数组中用于保存这一位的排序结果
            for (int i = 0;i < length; i++) {
                if (order[i] != 0) {    // 若桶里有数据则遍历此桶保存到原数组中
                    for (int j = 0; j < order[i]; j++) {
                        arr[k] = bucket[i][j];
                        k++;
                    }
                }
                order[i] = 0;   // 将桶里的计时器置为0，用作下一次位排序
            }
            n *= 10;    // 位数右移，即个位右移到十位
            k = 0;      // 将k置为0，用作下一次位排序
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = NumUtils.getRandomNums(NumUtils.LENGTH, NumUtils.MAX);
        NumUtils.printResult(arr, true);
        long startTime=System.currentTimeMillis();
        arr = radix(arr, NumUtils.MAX);                   // 排序
        long endTime=System.currentTimeMillis();
        NumUtils.printResult(arr, false);
        System.out.println("排序用时："+(endTime-startTime)+"毫秒");
    }
}
