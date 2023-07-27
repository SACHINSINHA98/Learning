package Intermediate.IntroToArrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        int b= sc.nextInt();

        int noOfRotations= (b% arr.length);
        reverse(arr,0,arr.length-1);
        reverse(arr,0,noOfRotations-1);
        int []arr1=reverse(arr,noOfRotations,arr.length-1);
        System.out.println(Arrays.toString(arr1));
    }

    private static int[] reverse(int[] arr, int start, int end) {
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }


}
