package Advanced.Array;

import java.util.*;

public class Missing {
    public static void main(String[] args) {
        String str="sachinsinha";

        HashMap<Character,Integer> map= new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
           if(map.containsKey(str.charAt(i))){
               map.put(str.charAt(i), (map.get(str.charAt(i)))+1);
           }else{
               map.put(str.charAt(i),1);
           }
        }
    Set<Map.Entry<Character,Integer>>entry=map.entrySet();
        Iterator<Map.Entry<Character,Integer>>itr= entry.iterator();
        List<Character>ans=new ArrayList<>();
        while(itr.hasNext()){
            Map.Entry<Character,Integer>e=itr.next();
            if(e.getValue()>1){
                ans.add(e.getKey());
            }
        }
        System.out.println(ans.get(0));
    }
}
