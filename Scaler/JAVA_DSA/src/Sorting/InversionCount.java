package Sorting;

import java.util.Arrays;

public class InversionCount {
    public static void main(String[] args) {
        int []arr={8,4,2,1};
        System.out.println(inversionCount(arr,0,arr.length-1));
    }

    private static int inversionCount(int[] arr, int l, int r) {
        int count=0;
        if (r==l)
            return 0;

        int mid=(l+r)/2;
         int m= inversionCount(arr,l,mid);
       int n= count + inversionCount(arr,mid+1,r);
        count=count+ m+n+ merge(arr,l,mid+1,r);

        return count;
    }
    static int merge(int[] arr, int l, int y, int r) {

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
                count=count+(b-a);
                b++;
                c++;
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
        return count;
    }

}
