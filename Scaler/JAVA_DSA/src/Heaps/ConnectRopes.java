package Heaps;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class ConnectRopes {
    public static void main(String[] args) {
        Integer[] arr = {1};
        List<Integer> list = Arrays.asList(arr);
        connectRopes(list);
    }

    private static void connectRopes(List<Integer> list) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        for (int i = 0; i < list.size(); i++) {
            pq.add(list.get(i));
        }
        int sum = 0;
        while (pq.size() > 1) {
            int m = pq.poll();
            int n = pq.poll();
            int cost = m + n;
            sum = sum + cost;
            pq.add(cost);
        }
        if(list.size()==1){
            System.out.println(list.get(0));
        }
        System.out.println(sum);
    }

}
