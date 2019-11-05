package algorithm.sort.insertsort;

import java.util.Arrays;

public class ShellSort {

    public static void shellSort(int[] arr) {
        int gap = arr.length;
        while (true) {
            gap /= 2;
            for (int i = 0; i < gap; i++) {
                for(int j = i+gap;j<arr.length;j+=gap){
                    int temp = arr[j];
                    int k = j -gap;
                    while(k>=0 && arr[k]>temp){
                        arr[k+gap] = arr[k];
                        k -=gap;
                    }
                    arr[k+gap] = temp;
                }
            }
            if(gap==1){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        ShellSort.shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
