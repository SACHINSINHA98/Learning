package Intermediate.TwoDArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MatrixRotation {
    public static void main(String[] args) {
        Integer[] arr = {1,2};
        Integer[] arr1 = {3,4};
        //Integer[] arr2 = {7,8,9};
        List<Integer> list1 = Arrays.asList(arr);
        List<Integer> list2 = Arrays.asList(arr1);
        //List<Integer> list3 = Arrays.asList(arr2);
        List<List<Integer>> A = new ArrayList<>();
        A.add(list1);
        A.add(list2);
       // A.add(list3);
        rotate(A);
    }

    private static void rotate(List<List<Integer>> ans) {
        List<List<Integer>> transpose = transpose(ans);
        List<List<Integer>> finalAns= new ArrayList<>();
        for(List<Integer>A:transpose){
            List<Integer> reverse = reverse(A);
            finalAns.add(reverse);
        }
        System.out.println(finalAns);
    }

    private static List<Integer> reverse(List<Integer> a) {
       int start= 0;
       int end= a.size()-1;
       while(start<end){
           Collections.swap(a,start,end);
           start++;
           end--;
       }
       return a;
    }

    private static List<List<Integer>> transpose(List<List<Integer>> list) {
        List<List<Integer>>ans= new ArrayList();
         for (int j = 0; j < list.get(0).size(); j++) {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            a.add(list.get(i).get(j));
        }
        ans.add(a);

    }
        //System.out.println(ans);
    return ans;
    }
}
