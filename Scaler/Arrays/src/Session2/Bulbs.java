package Session2;

import java.util.ArrayList;

public class Bulbs {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		int x=bulbs(list);
		System.out.println(x);
	}
	 public static int bulbs(ArrayList<Integer> A) {
		 int count=0; 
		 int flag=0;
		 for(int i=0;i<A.size();i++) {
			 if(A.get(i)==0) {
				 for(int j=A.size()-1;j>i;j--) {
					 if(A.get(j)==0) {
						 A.set(j, 1);
					 }else {
						 A.set(j, 0);
					 }
				 }
				 count++;
			 }
		 }
		 return count;
	    }
}
