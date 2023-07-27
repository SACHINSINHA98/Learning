package Advanced.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContinuousSumQuery {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 10};
        Integer[] arr1 = {2, 3, 20};
        Integer[] arr2 = {2, 5, 25};
        List<Integer> list1 = Arrays.asList(arr);
        List<Integer> list2 = Arrays.asList(arr1);
        List<Integer> list3 = Arrays.asList(arr2);
        List<List<Integer>> A = new ArrayList<>();
        A.add(list1);
        A.add(list2);
        A.add(list3);
        int a= 5;
        solve(A,a);
    }

    private static void solve(List<List<Integer>> B, int a1) {
        ArrayList<Integer>ans = new ArrayList(a1);
        for(int j=0 ; j< a1 ; j++){
            ans.add(0);
        }
        for(int i=0;i<B.size();i++){
            int left= B.get(i).get(0);
            int right= B.get(i).get(1);
            int amount= B.get(i).get(2);
            ans.set(left-1 ,ans.get(left-1)+amount);
            if(right < ans.size()){
                ans.set(right,(ans.get(right)+(-amount)));
            }
        }
        for(int k=1;k<ans.size();k++){
            ans.set(k,(ans.get(k-1)+ans.get(k)));
        }
        System.out.println(ans);
    }
}
