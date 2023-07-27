package Graphs;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathInAUndirectedGraph {
    static boolean isCycle(List<List<Integer>> arr, int[] visited){
        int v =7;
        for(int i=1;i<=v;i++){
            if(visited[i]==0){
                if(path(i,arr,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean path(int src,List<List<Integer>> arr, int[] visited){
        visited[src]=1;
        Queue<Pair<Integer,Integer>> queue= new LinkedList<>();
        queue.add(new Pair<>(src,-1));
        while(!queue.isEmpty()){
            Pair<Integer,Integer>top=queue.poll();
            int node= top.getKey();
            int parent= top.getValue();
            for(int i=0;i<arr.get(node).size();i++){
                if(visited[arr.get(node).get(i)]==0){
                    visited[arr.get(node).get(i)]=1;
                    queue.add(new Pair<>(arr.get(node).get(i),node));
                }else if(parent != arr.get(node).get(i)){
                        return true;
                }
            }
        }
       return false;
    }
    static boolean isCycleDfs(List<List<Integer>> arr, int[] visited){
        int v =7;
        for(int i=1;i<=v;i++){
            if(visited[i]==0){
                if(pathDfs(i,arr,visited,-1)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean pathDfs(int i, List<List<Integer>> arr, int[] visited, int parent) {
        visited[i]=1;
        for(int j=0;j<=arr.get(i).size();j++){
            if(visited[arr.get(i).get(j)]==0){
                if(pathDfs(arr.get(i).get(j),arr,visited,i)){
                    return true;
                }
            }
            else if(arr.get(i).get(j)!=parent){
                    return true;
            }
        }
        return false;
    }
}
