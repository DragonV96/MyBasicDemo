package com.glw;

/**
 * 归并排序
 * Create by glw
 * 2019/5/29 15:31
 */
public class Merge {

    public  static int[] merge(int[] arr, int left, int right) {
        if (!NumUtils.isNotNull(arr)) return null;
        if (left == right) return new int[] {arr[left]};    // 左索引等于右索引直接返回
        int mid = left + (right - left) / 2;        // 取中间点
        int[] leftArr = merge(arr, left, mid);      // 左有序数组递归
        int[] rightArr = merge(arr, mid + 1, right);      // 右有序数组递归
        int[] newArr = new int[leftArr.length + rightArr.length];      // 暂存新有序数组

        int m = 0, i = 0, j = 0;
        // 循环中，两个序列之间左有序数组i的值比右有序数组j的值小则交换位置
        while (i < leftArr.length && j < rightArr.length) {
            newArr[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
        }
        // 如果第一个序列未检测完，直接将后面所有元素加到合并的序列中，下同
        while (i < leftArr.length) newArr[m++] = leftArr[i++];
        while (j < rightArr.length) newArr[m++] = rightArr[j++];
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = NumUtils.getRandomNums(NumUtils.LENGTH, NumUtils.MAX);
        NumUtils.printResult(arr, true);
        long startTime=System.currentTimeMillis();
        arr = merge(arr, 0, arr.length - 1);                   // 排序
        long endTime=System.currentTimeMillis();
        NumUtils.printResult(arr, false);
        System.out.println("排序用时："+(endTime-startTime)+"毫秒");
    }
}
