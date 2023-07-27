package Graphs;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Convert0WithX {
    public static void main(String[] args) {
            char [][]arr= {{'X', 'X', 'X', 'X'},
                    {'X', 'O', 'X', 'X'},
                    {'X', 'O', 'O', 'X'},
                    {'X', 'O', 'X', 'X'},
                    {'X', 'X', 'O', 'O'}};
        System.out.println(Arrays.deepToString(fill(5,4,arr)));
        System.out.println(Arrays.deepToString(arr));

        }
        static char[][] fill(int n, int m, char a[][])
        {
            int [][]visited= new int[n][m];

            char[][]ans= new char[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    ans[i][j]=a[i][j];
                }
            }
            for(int i=0;i<m;i++){
                if(a[0][i]=='O'){
                    bfs(new Pair<Integer,Integer>(0,i),visited,a);
                    visited[0][i]=1;
                }
                if(a[n-1][i]=='O'){
                    bfs(new Pair(n-1,i),visited,a);
                    visited[n-1][i]=1;
                }
            }
            for(int i=0;i<n;i++){
                if(a[i][0]=='O'){
                    bfs(new Pair(i,0),visited,a);
                    visited[i][0]=1;
                }
                if(a[i][m-1]=='O'){
                    bfs(new Pair(i,m-1),visited,a);
                    visited[i][m-1]=1;
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(a[i][j]=='O' & visited[i][j]==0){
                        ans[i][j]='X';
                    }
                }
            }

            return ans;
        }
        static void bfs(Pair<Integer,Integer> pair,int[][] visited,char[][]a){
            Queue<Pair> queue= new LinkedList<>();
            queue.add(pair);
            int n=a.length;
            int m=a[0].length;
            while(!queue.isEmpty()){
                Pair<Integer,Integer> top=queue.poll();
                int row=top.getKey();
                int col=top.getValue();
                int []row1={0,-1,0,1};
                int []col1={-1,0,1,0};
                for(int i=0;i<4;i++){
                    int nRow=row+row1[i];
                    int nCol=col+col1[i];
                    if(nRow>=0 & nRow<n & nCol>=0 & nCol<m){
                        if(visited[nRow][nCol]==0 & a[nRow][nCol]=='O'){
                            visited[nRow][nCol]=1;
                            queue.add(new Pair(nRow,nCol));
                        }
                    }
                }
            }
        }
    }

