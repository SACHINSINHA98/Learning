package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinHeap implements Heaps {
    int[] arr = {10,3,8,24,0,-10,26};
    List<Integer> list = new ArrayList<>();
    @Override
    public void insert() {

        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
            int index= list.size()-1;
            int parent= (index-1)/2;
            while(index!=0 && list.get(index)<list.get(parent)){
                Collections.swap(list,index,parent);
                index=parent;
                parent= (index-1)/2 ;
            }
        }
        System.out.println(list);
        }




    public void delete() {}

}
