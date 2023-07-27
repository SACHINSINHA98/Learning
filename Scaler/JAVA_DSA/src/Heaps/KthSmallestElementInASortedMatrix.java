package Heaps;

import java.util.*;

public class KthSmallestElementInASortedMatrix {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList();
        int b = 12;
        Integer[] arr1 = {5, 9, 11};
        Integer[] arr2 = {9, 11, 13};
        Integer[] arr3 = {10, 12, 15};
        Integer[] arr4 = {13, 14, 16};
        Integer[] arr5 = {16, 20, 21};
        List<Integer> li1 = Arrays.asList(arr1);
        List<Integer> li2 = Arrays.asList(arr2);
        List<Integer> li3 = Arrays.asList(arr3);
        List<Integer> li4 = Arrays.asList(arr4);
        List<Integer> li5 = Arrays.asList(arr5);
        list.add(li1);
        list.add(li2);
        list.add(li3);
        list.add(li4);
        list.add(li5);
        smallestInMatrix(list, b);

    }

    private static void smallestInMatrix(List<List<Integer>> A, int B) {
        int m = A.size(), n = A.get(0).size();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        ;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                maxHeap.add(A.get(r).get(c));
                if (maxHeap.size() > B)  maxHeap.poll();
            }
        }
        System.out.println(maxHeap.poll());

    }
}
