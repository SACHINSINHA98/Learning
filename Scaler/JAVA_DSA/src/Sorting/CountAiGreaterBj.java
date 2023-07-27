package Sorting;

import java.util.Arrays;

public class CountAiGreaterBj {
    public static void main(String[] args) {
        int []arr1={7,8,2,4};
        int []arr2={3,5,1,10};
        count(arr1,arr2);
    }

    private static void count(int[] arr1, int[] arr2) {
        int count=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                count= count + (arr1.length-i);
                j++;
            }else{
                i++;
            }
        }
        System.out.println(count);
    }
}
