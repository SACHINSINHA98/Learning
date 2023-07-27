package HashMapPractice;

//linkedhashmap order of insertion is maintained
//treeMap order of hashmap sorted in keys
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapBasics {
 public static void main(String[] args) {
	HashMap< Integer, String> map= new HashMap<>();
	map.put(1, "Sachin");
	map.put(2, "Sinha");
	map.put(3, "Sac");
	
	//iterate over a hashmap
	//iterate over keys
	Set<Integer>set=map.keySet();
	Iterator<Integer>it=set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	set.forEach(s->System.out.print(s));
	System.out.println("--------------------------");
	//iterate over values
	Collection<String>col=map.values();
	Iterator<String>it1= col.iterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
	System.out.println("--------------------------");
	//each key value pair is called entry we have a thing like entry set
	Set<Entry<Integer,String>>entryset=map.entrySet();
	Iterator<Entry<Integer,String>>it2= entryset.iterator();
	while(it2.hasNext()) {
		//System.out.println(it2.next());
		
		 Entry<Integer, String>entry = it2.next();
		 System.out.println(entry.getKey()+" "+entry.getValue());
		 }
	entryset.forEach(Entry->System.out.println(Entry.getValue()));
	System.out.println("--------------------------");
	
}
}