package Advanced.BinarySearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BiotonicPoint {
    public static void main(String[] args) {
        Integer []arr= {1,2,3,4,5,6,7,8,9,10,20,19,18,17,16,15,14,13,12,11};
        List<Integer> A= Arrays.asList(arr);
        int b=12;
        System.out.println(search(A,b));
    }

    private static int search(List<Integer> A,int target) {
        System.out.println(bioPoint(A));
        int bioPoint=bioPoint(A);
        int ans=-1;
        if(A.get(bioPoint)==target){
            return bioPoint;
        }else if(A.get(bioPoint)<target){
            return -1;
        }else if(A.get(bioPoint)>target){
            ans=leftbinarySearch(A,0,bioPoint-1,target);
            if(ans!=-1){
                return ans;
            }else{
                return rightbinarySearch(A,bioPoint+1,A.size()-1,target);
            }
        }
        return -1;
    }

    private static int leftbinarySearch(List<Integer> A, int start, int end,int target) {
        while(start<=end){
            int mid=(start+end)/2;
            if(A.get(mid)==target){
                return mid;
            }else if(A.get(mid)>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    private static int rightbinarySearch(List<Integer> A, int start, int end,int target) {
        while(start<=end){
            int mid=(start+end)/2;
            if(A.get(mid)==target){
                return mid;
            }else if(A.get(mid)<target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    private static int bioPoint(List<Integer> list) {
        if(list.get(0)>list.get(1)){
          return 1;
        }
        if(list.get(list.size()-1)>list.get(list.size()-2)){
            return list.size()-1;
        }
        int start=1;
        int end=list.size()-2;
        while(start<=end){
            int mid =(start+end)/2;
            if(list.get(mid)>list.get(mid-1) && list.get(mid)>list.get(mid+1)){
                return mid;
            }else if(list.get(mid)<list.get(mid+1)){
                start=mid+1;
            }else {
                end =mid-1;
            }
        }
        return -1;
    }
}
