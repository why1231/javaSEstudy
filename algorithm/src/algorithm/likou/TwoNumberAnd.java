/***
 * ����֮�͵����⣬������������˵�һ�������ҵĽ��������û�н�����㿪ͷ������
 * �ڶ������ǹٷ���
 */

package algorithm.likou;

import java.util.Arrays;

public class TwoNumberAnd {

    public static int[] twoNum(int[] arr, int target) {
        int length = arr.length;
        int[] result = new int[length];
        int[] check = new int[length];
        int count = 0;
        int index = 0;
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < length - 1; i++) {
            temp = target - arr[i];
            index = i;
            for (int j = 0; j < length; j++) {
                if (check[j] == arr[i]) flag = true;
            }
            if (!flag) {
                for (int k = i + 1; k < length; k++) {
                    if (arr[k] == temp) {
                        result[count] = i;
                        check[count] = arr[i];
                        count++;
                        result[count] = k;
                        check[count] = arr[k];
                        count++;
                    }
                }
            }
            flag = false;
        }
        int[] finish = new int[count];
        for (int m = 0; m < count; m++) {
            finish[m] = result[m];
        }
        return finish;
    }

    public static void main(String[] args) {
        int[] arr = {0, 4, 3, 0};
        int target = 0;
        System.out.println(Arrays.toString(twoNum(arr, target)));
    }

}

class TwoNum{
    public static int[] twoNum(int[] arr,int target){
        for(int i = 0 ;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==target-arr[i]){
                    return new int[] {i,j};
                }
            }
        }
        throw new RuntimeException("�������������ĺ͵���target");
    }

    public static void main(String[] args) {
        int[] arr= {1,4,8,29,78};
        int target = 86;
        System.out.println(Arrays.toString(twoNum(arr,target)));
    }
}