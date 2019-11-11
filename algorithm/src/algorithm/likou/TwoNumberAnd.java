package algorithm.likou;

import java.util.Arrays;

public class TwoNumberAnd {

    public static int[] twoNum(int[] arr,int target){
        int length = arr.length;
        int[] result = new int [length];
        int[] check = new int [length];
        int count = 0;
        int index = 0;
        int temp = 0;
        boolean flag = false;
        for(int i = 0;i<length-1;i++){
            temp = target-arr[i];
            index = i;
            for(int j = 0;j<length;j++){
                if(check[j] == arr[i])  flag = true;
            }
            if(!flag){
                for(int k = 0 ;k<length;k++){
                    if(arr[k]==temp){
                        result[count] = i;
                        check[count]=arr[i];
                        count++;
                        result[count] = k;
                        check[count] = arr[k];
                        count++;
                    }
                }
            }
            flag = false;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        System.out.println(Arrays.toString(twoNum(arr,target)));
    }

}
