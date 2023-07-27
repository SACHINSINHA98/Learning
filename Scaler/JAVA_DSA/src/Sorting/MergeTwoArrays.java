package Sorting;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;
import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 7, 12, 20, 24, 29};
        int[] arr2 = {6, 9, 10, 14, 18, 19};
        merge(arr1, arr2);
    }

     static void merge(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int N = arr1.length + arr2.length;
        int[] arr = new int[N];
        int k=0;
        while ( i<arr1.length && j<arr2.length) {

            if (arr1[i] < arr2[j]) {
                    arr[k] = arr1[i];
                    i++;
                    k++;

                } else if (arr2[j] <= arr1[i]) {
                    arr[k] = arr2[j];
                    j++;
                    k++;
                }
            }
        while(i<arr1.length){
            arr[k]=arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            arr[k]=arr2[j];
            k++;
            j++;
        }


        System.out.println(Arrays.toString(arr));
        }




}



