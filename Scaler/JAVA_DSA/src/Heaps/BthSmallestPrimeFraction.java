package Heaps;

import javafx.util.Pair;

import java.util.*;

class Fraction{
    double numerator;
    double denominator;
    double fraction;

    public Fraction(double numerator, double denominator, double fraction) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.fraction = fraction;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                ", fraction=" + fraction +
                '}';
    }
}
public class BthSmallestPrimeFraction {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 5};
        int b=3;
        List<Integer> list = Arrays.asList(arr);
        prime(list,b);
    }

    private static void prime(List<Integer> list, int b) {
        PriorityQueue<Fraction>pq= new PriorityQueue<>( (o1, o2) -> {
            return Double.compare(o1.fraction, o2.fraction);
        });
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                double num= list.get(i);
                double den= list.get(j);
                double fractionValue= (num/den);
                Fraction f = new Fraction(num,den,fractionValue);
                pq.add(f);
            }
        }
        System.out.println(pq);
        ArrayList<Integer>ans=new ArrayList<>();
        Fraction ansfraction = null;
        while(b>0){
           ansfraction= pq.poll();
            b--;
        }
        ans.add((int)ansfraction.numerator);
        ans.add((int)ansfraction.denominator);
        System.out.println(ans);
    }


}
