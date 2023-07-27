package Sorting;

import java.util.Arrays;

public class MergerInSameArray {
    public static void main(String[] args) {
        int []arr={8,1,3,6,11,2,4,9,7,6};
        int l=2;
        int y=5;
        int r=7;
        merge(arr,l,y,r);
    }

    static void merge(int[] arr, int l, int y, int r) {

        int length=r-l+1;
        int []arr1=new int[length];
        int c=0;
        int a=l;
        int b=y;
        int count=0;
        while(a<y && b<=r){
            if(arr[a]<arr[b]){
                arr1[c]=arr[a];
                a++;
                c++;
            }else{
                arr1[c]=arr[b];
                b++;
                c++;
                count=count+(b-a);
            }
        }
        while(a<y){
            arr1[c]=arr[a];
            a++;
            c++;

        }
        while(b<=r){
            arr1[c]=arr[b];
            b++;
            c++;
        }
        for(int i=0;i<arr1.length;i++){
             arr[i+l]=arr1[i];
        }
        //System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
    }

}
