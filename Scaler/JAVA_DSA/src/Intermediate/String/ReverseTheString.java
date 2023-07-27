package Intermediate.String;

import java.util.ArrayList;

public class ReverseTheString {
    public static void main(String[] args) {
        String str= "my self  ";
        ArrayList<Character>A= new ArrayList<>();
        A.add('A');
        System.out.println(A.get(0)+32);
        for(int i=0;i<A.size();i++){
                if(A.get(i)>='A' && A.get(i)<='Z'){
                    A.set(i,A.set(i, (char) (A.get(i)+32)));
                }
        }



        reverseString(str);
    }

    private static void reverseString(String str) {
        int l=0;
        int r=str.length()-1;
        String rev=reverse(str,l,r);
        int revl=0;
        int revr=1;
        while(revr<rev.length()){
             if((rev.charAt(revr)==' '|| revr==rev.length()-1 )&& ((rev.charAt(revr)==' ' && rev.charAt(revr-1)!=' '))){
                  int start=revl;
                  int end=0;
                  if(revr!=rev.length()-1){
                   end=revr-1;
                  }else{
                      end=revr;
                  }
                  rev=reverse(rev,start,end);
                  revl=revr+1;
            }
            revr++;
        }
        System.out.println(rev.trim());

    }
    private static String reverse(String str, int l, int r) {
        StringBuilder s= new StringBuilder(str);
        while(l<r){
        char temp=s.charAt(l);
        s.setCharAt(l,s.charAt(r));
        s.setCharAt(r,temp);
        l++;
        r--;
        }
        return s.toString();
    }

}

