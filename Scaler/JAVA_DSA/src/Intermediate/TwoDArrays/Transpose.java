package Intermediate.TwoDArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Transpose {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>ans= new ArrayList<>(5);
        ArrayList<Integer>list= new ArrayList<>(5);
        for(int i=0;i<5;i++){
            list.add(0);
        }
        for(int i=0;i<5;i++){
            ans.add(list);
        }
        Integer[] arr = {24, 63, 39, 81, 84, 30};
        Integer[] arr1 = {21, 64, 95, 6, 88, 73};
        Integer[] arr2 = {33, 6, 63, 96, 86, 66};
        Integer[] arr3 = {62, 88, 23, 52, 94, 77};
        Integer[] arr4 = {81, 58, 74, 18, 16, 25};
        Integer[] arr5 = {26, 40, 88, 64, 72, 23};
        Integer[] arr6 = {45, 44, 86, 92, 50, 26};
        List<Integer> list1 = Arrays.asList(arr);
        List<Integer> list2 = Arrays.asList(arr1);
        List<Integer> list3 = Arrays.asList(arr2);
        List<Integer> list4 = Arrays.asList(arr3);
        List<Integer> list5 = Arrays.asList(arr4);
        List<Integer> list6 = Arrays.asList(arr5);
        List<Integer> list7 = Arrays.asList(arr6);
        List<List<Integer>> A = new ArrayList<>();
        A.add(list1);
        A.add(list2);
        A.add(list3);
        A.add(list4);
        A.add(list5);
        A.add(list6);
        A.add(list7);
        int col=(A.get(0).size())-1;
        System.out.println(A.get(0).get(col));
        System.out.println(col);


        solve(A);
        System.out.println(A);
    }

    public static List<List<Integer>> solve(List<List<Integer>> list) {
        List<List<Integer>> ans = new ArrayList<>();
        if (list.size() == list.get(0).size()) {
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < i; j++) {
                    ArrayList<Integer> a = new ArrayList();
                    a.add(i);
                    a.add(j);
                    swap(list, a);
                }
            }
            return list;
        } else {

            for (int j = 0; j < list.get(0).size(); j++) {
                ArrayList<Integer> a = new ArrayList<>();
                for (int i = 0; i < list.size(); i++) {
                    a.add(list.get(i).get(j));
                }
                ans.add(a);
            }
        }
        System.out.println(ans);
        return ans;
    }
    public static void swap(List<List<Integer>> list, List<Integer> a) {
        int indexRow = a.get(0);
        int indexCol = a.get(1);
        int temp = list.get(indexCol).get(indexRow);
        list.get(indexCol).set(indexRow, list.get(indexRow).get(indexCol));
        list.get(indexRow).set(indexCol, temp);
    }

}
