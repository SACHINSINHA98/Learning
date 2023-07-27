package Graphs;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2},
                {0,1,2},
                {2,1,1},
        };
        int flag=0;
        for(int i=5;i>=0;i--){
            for(int j=i;j>=0;j--){
                if(j==2){

                    break;
                }
                System.out.println(i + ""+ j);
            }

        }

        System.out.println(orangesRotting(arr));
    }
    static int orangesRotting(int[][] grid) {
        Queue<Pair<Integer,Integer>> queue= new LinkedList<>();
        int [][]visited=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.add(new Pair(i,j));
                    visited[i][j]=1;
                }
            }
        }
        int time=bfs(grid,queue,visited);
        int flag=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    flag=1;
                }
            }
        }
        if(flag==1){
            return -1;
        }
        return time;
    }
    static int bfs(int[][] grid,Queue<Pair<Integer,Integer>>queue,int [][]visited) {
        int time=-1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Pair top =queue.poll();
                Integer row=(Integer)top.getKey();
                Integer col=(Integer)top.getValue();
                for(int j=-1 ; j<=1;j++){
                    int nRow=row+j;
                    int nCol=col;
                    if(nRow>=0 & nRow<grid.length & nCol>=0 & nCol<grid[0].length){
                        if(grid[nRow][nCol]!=0 & grid[nRow][nCol]==1 & visited[nRow][nCol]==0 & grid[nRow][nCol]!=2){
                            queue.add(new Pair<Integer,Integer>(nRow,nCol));
                            visited[nRow][nCol]=1;
                            grid[nRow][nCol]=2;
                        }
                    }
                }
                for(int k=-1 ; k<=1;k++){
                    int nRow=row;
                    int nCol=col+k;
                    if(nRow>=0 & nRow<grid.length & nCol>=0 & nCol<grid[0].length){
                        if(grid[nRow][nCol]!=0 & grid[nRow][nCol]==1 & visited[nRow][nCol]==0 & grid[nRow][nCol]!=2){
                            queue.add(new Pair<Integer,Integer>(nRow,nCol));
                            visited[nRow][nCol]=1;
                            grid[nRow][nCol]=2;
                        }
                    }
                }
            }
            time++;

        }
        return time;
    }
}
