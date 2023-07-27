package PrefixSum;

import java.util.ArrayList;

public class Addone {
public static void main(String[] args) {
	ArrayList<Integer>list= new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(9);
	addinglogic(list);
}

private static void addinglogic(ArrayList<Integer> list) {
	int carry=0;
	int number=0;
	if(list.get(list.size()-1)<9) {
			carry=0;
			number= list.get(list.size()-1)+1;
			list.set(list.size()-1, (number+carry)%10);
	}else {
		carry=1;
	}
	
	System.out.println(list);
}
}


