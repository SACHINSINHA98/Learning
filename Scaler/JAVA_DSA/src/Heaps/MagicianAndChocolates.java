package Heaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MagicianAndChocolates {
    public static void main(String[] args) {
        Integer[] arr = {2147483647,2000000014,2147483647};
        int a=10;
        List<Integer> list = Arrays.asList(arr);
        chocolates(list,a);
    }

    private static void chocolates(List<Integer> list,int a) {
        PriorityQueue<Integer>pq= new PriorityQueue(Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            pq.add(list.get(i));
        }
        int M = 1000000007;
        int sum=0;
        while(a>0){
           int max=pq.poll();
            sum = (sum % M + max % M) % M;
            pq.add(max/2);
            a--;
        }
        System.out.println(sum);
    }
}
