package Recursion;

public class MagicNumber {
    public static void main(String[] args) {
        int m=solve(83557);
        System.out.println(m);
    }
    public static int solve(int A) {

        if (A > 9) {
          A= solve(sum(A));
        }
        //while(A>9){
        // A=sum(A);
        // }
        if (A == 1) {
            return 1;
        }
        return 0;
    }

    public static int sum(int A) {

        if (A == 0) {
            return 0;
        }
        return sum(A / 10) + A % 10;
    }
}


