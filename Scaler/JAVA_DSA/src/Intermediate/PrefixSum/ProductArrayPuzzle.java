package Intermediate.PrefixSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductArrayPuzzle {
    public static void main(String[] args) {
        Integer []arr={1, 2, 3, 4, 5};
        List<Integer> list= Arrays.asList(arr);
        product(list);
        
    }

    private static void product(List<Integer> list) {
        ArrayList<Integer> prefixMul= new ArrayList<>();
        int n=list.size();
        ArrayList<Integer> suffixMul= new ArrayList<>(n);
        for(int i=0;i<list.size();i++){
            suffixMul.add(null);
        }
        int mul=1;
        for(int i=0;i<list.size();i++){
           mul=mul*list.get(i);
           prefixMul.add(i,mul);
        }
        int mul1=1;
        for(int j=list.size()-1;j>=0;j--){
            mul1=mul1*list.get(j);
            suffixMul.set(j,mul1);
        }
        ArrayList<Integer> ansMul= new ArrayList<>(n);
        for(int k=0;k<list.size();k++){
            int index=k;
            if(index==0){
                ansMul.add(suffixMul.get(k+1));
            } else if(index== list.size()-1){
                ansMul.add(prefixMul.get(k-1));
            }else{
                ansMul.add(prefixMul.get(k-1)*suffixMul.get(k+1));
            }

        }
        System.out.println(ansMul);
    }
}
