package Graphs;

import java.util.*;

public class BreadthFirstSearch {
    static void bfs(List<List<Integer>> arr) {
        List<Integer> visited = new ArrayList<>(arr.size()+1);
        for (int i = 0; i <= arr.size()+1; i++) {
            visited.add(0);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited.set(1,1);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Integer top = q.poll();
                System.out.print(top+ " ");
                for (int j = 0; j < arr.get(top).size(); j++) {
                    if (visited.get(arr.get(top).get(j)) == 0) {
                        visited.set(arr.get(top).get(j), 1);
                        q.add(arr.get(top).get(j));
                    }
                }
            }
            System.out.println(" ");
        }
    }
}
