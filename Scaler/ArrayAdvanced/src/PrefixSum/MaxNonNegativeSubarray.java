package PrefixSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxNonNegativeSubarray {
public static void main(String[] args) {
	Integer []arr= {1,2,5,-7,1,2,4,1,-1};
	List<Integer>A= Arrays.asList(arr);
	sum(A);
	maxset(A);
	
}

private static ArrayList<Integer> sum(List<Integer> A) {
	Integer currentmaxsum=0;
	Integer Allmaxsum=0;
	ArrayList<Integer>currentmaxArray= new ArrayList<>();
	ArrayList<Integer>AllmaxArray= new ArrayList<>();
	for(int i =0;i<A.size();i++) {
		if(A.get(i)>0) {
			 currentmaxsum=currentmaxsum+A.get(i);
			 currentmaxArray.add(A.get(i));
		}else {
			currentmaxsum=0;
			currentmaxArray=new ArrayList<>();
		}
		if(Allmaxsum<currentmaxsum || Allmaxsum==currentmaxsum && currentmaxArray.size()>AllmaxArray.size() ) {
			Allmaxsum= currentmaxsum;
			AllmaxArray= currentmaxArray;
			
		}
	}
	System.out.println(AllmaxArray +" "+ Allmaxsum);
	return AllmaxArray;
}

private static void maxset(List<Integer> A) {
        ArrayList<Integer>list= new ArrayList();
        int sum=0;
        int index1=0;
        int index2=0;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            
            if(A.get(i)>0){
                sum=sum+A.get(i);
                
                if(sum>max){
                    max=sum;
                    }
                list.add(A.get(index2));
                index2++;
            }else{
                sum=0;
                list.clear();
				index2=i+1;
            }
        }
       System.out.println(list);
    }


}