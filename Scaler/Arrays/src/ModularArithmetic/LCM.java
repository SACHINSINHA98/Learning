package ModularArithmetic;

import java.util.ArrayList;
import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {

				String A="8";
		       String m="";
		       int s;
		       if(A.length()==1 || A.length()==2){
		           s=Integer.parseInt(A);
		       }else{
		           for (int i = A.length()-3; i < A.length(); i++) {
					
					m=m.concat(A.charAt(i)+"");
				}
		           s=Integer.parseInt(m);}
				
				
				
		        System.out.println(s);
			
		
	}
}