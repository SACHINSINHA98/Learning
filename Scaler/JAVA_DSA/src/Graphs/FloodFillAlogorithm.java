package Graphs;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFillAlogorithm {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1},
                {2, 2, 0},
                {2, 2, 2},
        };
        int sr = 2;
        int sc = 0;
        int newColour = 3;
        int visited[][] = new int[arr.length][arr[0].length];
        floodFill(new Pair<Integer, Integer>(sr, sc), newColour, arr, visited);
        System.out.println(Arrays.deepToString(arr));
    }

    private static void floodFill(Pair<Integer, Integer> integerIntegerPair, int newColour, int[][] arr, int[][] visited) {
        int initialColour = arr[integerIntegerPair.getKey()][integerIntegerPair.getValue()];
        Queue<Pair> queue = new LinkedList<>();
        queue.add(integerIntegerPair);
        arr[integerIntegerPair.getKey()][integerIntegerPair.getValue()] = newColour;
        visited[integerIntegerPair.getKey()][integerIntegerPair.getValue()] = 1;
        while (!queue.isEmpty()) {
            Pair<Integer, Integer> top = queue.poll();
            int row = top.getKey();
            int col = top.getValue();

            for (int i = -1; i <= 1; i++) {
                int neighRow = row + i;
                int neighCol = col;
                if (neighRow >= 0 & neighRow < arr.length & neighCol >= 0 & neighCol < arr[0].length) {
                    if ( arr[neighRow][neighCol] == initialColour & visited[neighRow][neighCol] == 0) {
                        queue.add(new Pair<>(neighRow, neighCol));
                        arr[neighRow][neighCol] = newColour;
                        visited[neighRow][neighCol]=1;
                    }
                }
            }
                for (int j = -1; j <= 1; j++) {
                    int nRow = row;
                    int nCol = col + j;
                    if (nRow >= 0 & nRow < arr.length & nCol >= 0 & nCol < arr[0].length) {
                        if ( arr[nRow][nCol] == initialColour & visited[nRow][nCol] == 0) {
                            queue.add(new Pair<>(nRow, nCol));
                            arr[nRow][nCol] = newColour;
                            visited[nRow][nCol]=1;
                        }
                    }

                }
            }
        }
    }

