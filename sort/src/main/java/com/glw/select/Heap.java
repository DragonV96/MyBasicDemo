package com.glw.select;

import com.glw.NumUtils;

/**
 * 堆排序
 * @author glw
 * @date 2019/5/29 9:35
 */
public class Heap {

    // 交换堆中第一个与最后一个元素，返回最后一个元素（最大值元素），然后把其余部分重新调整为大根堆
    public static void heapSort(int arr[], int parent, int length) {
        int temp = arr[parent];     // 保存当前父节点
        int child = parent * 2 + 1; // 取左子节点
        while (child < length) {
            // 若有右子节点，且右子节点值大于左子节点，则取右子节点
            if (child + 1 < length && arr[child + 1] > arr[child]) {
                child++;
            }
            // 若父节点的值大于子节点的值，跳出循环
            if (temp >= arr[child]) {
                break;
            }
            // 把子节点的值赋给父节点
            arr[parent] = arr[child];
            // 取子节点的左子节点，然后继续向下循环筛选
            parent = child;
            child = 2 * child + 1;
        }
        arr[parent] = temp;
    }

    // 堆排序开始入口
    public static void heap(int heap[]) {
        if (!NumUtils.isNotNull(heap)) return;
        int length = heap.length;
        // 建立初始堆
        for (int i = length / 2; i >= 0; i--) {
            heapSort(heap, i, length);
        }
        // 进行n-1次循环，完成排序
        for (int i = length - 1; i > 0; i--) {
            // 最后一个元素和第一元素进行交换
            NumUtils.exchange(heap, 0, i);
            // 筛选根节点，得到i-1个节点的堆
            heapSort(heap, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = NumUtils.getRandomNums(NumUtils.LENGTH, NumUtils.MAX);
        NumUtils.printResult(arr, true);
        long startTime=System.currentTimeMillis();
        heap(arr);                   // 排序
        long endTime=System.currentTimeMillis();
        NumUtils.printResult(arr, false);
        System.out.println("排序用时："+(endTime-startTime)+"毫秒");
    }
}
