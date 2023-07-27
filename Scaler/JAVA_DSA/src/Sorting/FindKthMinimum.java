package Sorting;

import java.util.Arrays;



public class FindKthMinimum {
    public static void main(String[] args) {
        int []arr={1,5,-1,2,10,3,5};
        int a=7;
        minimum(arr,a);
    }

    private static void minimum(int[] arr, int a) {
        for(int i=0;i<a;i++){
            for(int j=i;j<arr.length;j++){
                int min=arr[i];
                int minIndex=i;
                if(min>arr[j] ){
                    min=arr[j];
                    minIndex=j;
                }
                if(arr[i]!=arr[minIndex])
                  swap(arr,i,minIndex);
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
