package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Integer[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        List<Integer> list = Arrays.asList(arr);
        int b = 7;
        distribute(list, b);
    }

    private static void distribute(List<Integer> list, int b) {
        int length = list.size();
        Collections.sort(list);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i <= length - b; i++) {
            int m = i + b;
            diff = Math.min(diff, (list.get(m - 1) - list.get(i)));
        }
        System.out.println(diff);
    }
}
