package Recursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintLinearlyFrom1ToN {
    public static void main(String[] args) {
        int count=1;
        int n=10;
        rPrint(count,n);
        System.out.println("-----------------------------");
        reversePrint(n);
        System.out.println("-----------");
        bPrint(count,n);
        System.out.println(sum(n));
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        reverse(0,list.size()-1,list);
        System.out.println(list);
        String str="sachin";
        System.out.println(isPalindrome(str,0,str.length()-1));
    }

    private static boolean isPalindrome(String str,int i, int length) {
        if(i>=length){
            return true;
        }
        if(str.charAt(i)==str.charAt(length)){
            return isPalindrome(str,i+1,length-1);
        }

       return false;
    }

    private static void reverse(int i, int size, List<Integer> list) {
        if(i>size){
            return;
        }
        Collections.swap(list,i,size);
        reverse(i+1,size-1,list);
    }

    private static int sum(int n) {
        if(n==1){
            return 1;
        }
        int sum=n+sum(n-1);
        return sum;
    }

    private static void bPrint(int count, int n) {
        if(count>n){
            return;
        }
        bPrint(count+1,n);
        System.out.print(count+" ");
    }

    private static void reversePrint(int n) {
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        reversePrint(n-1);
    }

    private static void rPrint(int count,int n) {
        if(count>n){
            return;
        }
        System.out.print(count +" ");
        count++;
        rPrint(count,n);
    }

}
