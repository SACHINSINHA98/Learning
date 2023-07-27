package Sorting;
import Sorting.MergeTwoArrays;
import Sorting.MergerInSameArray;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []arr={3,5,1,8,2,5,6};

        mergeSort(arr,0,arr.length-1);

    }

    private static void mergeSort(int[] arr,int l, int r) {
        if(l==r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        MergerInSameArray.merge(arr,l,mid+1,r);
        //System.out.println(Arrays.toString(arr));
    }

}
