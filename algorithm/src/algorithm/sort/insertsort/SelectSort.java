package algorithm.sort.insertsort;

import java.util.Arrays;

public class SelectSort {

    public static void selectSort(int[] arr) {
        int min, temp;
        for (int i = 0; i < arr.length; i++) {
            //初始化未排序序列最小数据数据下标
            min = i;

            // 在未排序元素中继续寻找最小元素，并保存其下标
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            //把找到的最小数和当前数交换
            if (min != i) {
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
