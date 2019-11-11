package algorithm.sort.insertsort;

import java.util.Arrays;

public class SelectSort {

    public static void selectSort(int[] arr) {
        int min, temp;
        for (int i = 0; i < arr.length; i++) {
            //��ʼ��δ����������С���������±�
            min = i;

            // ��δ����Ԫ���м���Ѱ����СԪ�أ����������±�
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            //���ҵ�����С���͵�ǰ������
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
