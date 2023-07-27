package Heaps;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumArraySumAfterBNegations {
    public static void main(String[] args) {
        Integer[] arr = {57, 3, -14, -87, 42, 38, 31, -7, -28, -61};
        int b = 10;
        List<Integer> list = Arrays.asList(arr);
        maxProduct(list, b);
    }

    private static void maxProduct(List<Integer> list, int b) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        for (int i = 0; i < list.size(); i++) {
            pq.add(list.get(i));
        }
        Iterator<Integer> itr = pq.iterator();
        while (b > 0) {
            int removed = pq.poll();
            b--;
            pq.add(-removed);
        }
        Integer sum = 0;
        while (itr.hasNext()) {
           sum= sum+pq.poll();
        }
        System.out.println(sum);
    }
}
