package Intermediate.Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ColorfulNumber {
    public static void main(String[] args) {
        int a= 263;
        solve(a);
    }

    private static void solve(int A) {
        ArrayList<Integer> list = new ArrayList();
        while(A>0){
            list.add(A%10);
            A=A/10;
        }
        Collections.reverse(list);
        HashSet<Integer> set= new HashSet();
        for(int i=0;i<list.size();i++){
            int product=1;
            for(int j=i; j<list.size();j++){
                product= product*list.get(j);
                if(set.contains(product)){
                    System.out.println(0);
                }
                else{
                    set.add(product);
                }
            }
        }
        System.out.println(1);

    }
}
