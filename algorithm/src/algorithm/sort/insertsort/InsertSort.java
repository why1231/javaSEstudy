package algorithm.sort.insertsort;

import java.util.Arrays;

public class InsertSort {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                int temp=arr[i];
                for(int j = i; j>=0;j--){
                    if(j>0 && arr[j-1]>temp){
                        arr[j] = arr[j-1];
                    }else{
                        arr[j]=temp;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr ={9,8,7,6,5,4,3,2,1,0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
