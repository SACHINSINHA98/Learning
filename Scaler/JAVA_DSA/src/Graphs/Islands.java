package Graphs;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class Islands {
    public static void main(String[] args) {
        int[][]arr={{0,1,1,0},
                    {0,1,1,0},
                    {0,0,1,0},
                    {0,0,0,0},
                    {1,1,0,1}};
        int visited[][]= new int[arr.length][arr[0].length];
        int count=0;
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(visited[row][col]==0 && arr[row][col]==1){
                    count++;
                    bfs(new Pair<>(row,col),visited,arr);

                }
            }
        }
        System.out.println(count);
    }

    private static void bfs(Pair<Integer, Integer> integerIntegerPair, int[][] visited, int[][] arr) {

        visited[integerIntegerPair.getKey()][integerIntegerPair.getValue()]=1;
        Queue<Pair> queue= new LinkedList<>();
        queue.add(integerIntegerPair);
        while(!queue.isEmpty()){
            Pair<Integer,Integer> top = queue.poll();
            int row = top.getKey();
            int col= top.getValue();
            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                    int neighRow= row+i;
                    int neighCol=col+j;
                    if(neighRow>=0 & neighRow<arr.length & neighCol<arr[0].length & neighCol>=0) {
                        if(arr[neighRow][neighCol]==1 & visited[neighRow][neighCol]==0){
                            queue.add(new Pair<>(neighRow,neighCol));
                            visited[neighRow][neighCol]=1;
                        }

                    }


                }
            }
        }

    }
}
