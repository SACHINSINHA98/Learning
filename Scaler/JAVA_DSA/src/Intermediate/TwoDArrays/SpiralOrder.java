package Intermediate.TwoDArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpiralOrder {
    public static void main(String[] args) {
        int A=5;
        spiral(A);

    }

    private static void spiral(int A) {
        Integer [][]arr = new Integer[A][A];
        Integer count=1;
        int i=0;
        int j=0;
        while(A>1){
            for(int k=0;k<A-1;k++){
                arr[i][j]=count;
                count++;
                j++;
            }
            for(int k=0;k<A-1;k++){
                arr[i][j]=count;
                count++;
                i++;
            }
            for(int k=0;k<A-1;k++){
                arr[i][j]=count;
                count++;
                j--;
            }
            for(int k=0;k<A-1;k++){
                arr[i][j]=count;
                count++;
                i--;
            }
            A=A-2;
            i++;
            j++;
            if(A==1){
                arr[i][j]=count;
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }


}
