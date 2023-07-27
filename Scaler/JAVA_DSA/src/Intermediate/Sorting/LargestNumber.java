package Intermediate.Sorting;

import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Integer []arr={472,663,964,722,485,852,635,4,368,676,319,412};
        List<Integer> list= Arrays.asList(arr);

        largestNumber(list);
    }

    private static void largestNumber(List<Integer> list) {
        List<Integer>list1= new ArrayList<>();
        for(int i=0;i<list.size();i++){
            list1.add(list.get(i));
        }
        Comparator comparator =(a,b)->{
            String ab=a+""+b;
            String ba=b+""+a;

            if(Double.parseDouble(ab)>Double.parseDouble(ba)){
                return -1;
            }else if(Double.parseDouble(ab)<Double.parseDouble(ba)){
                return 1;
            }
            return 0;
        };
        Collections.sort(list1,comparator);
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<list1.size();i++){
            builder.append(list1.get(i));
        }
        if(Double.parseDouble(builder.toString())==0){
            System.out.println("0");
        }else
            System.out.println(builder.toString());
    }
}
