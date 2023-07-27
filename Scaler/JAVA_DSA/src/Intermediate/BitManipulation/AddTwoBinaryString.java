package Intermediate.BitManipulation;

public class AddTwoBinaryString {
    public static void main(String[] args) {
        String a = "1010110111001101101000";
        String b = "1000011011000000111100110";
        add(a, b);
    }

    private static void add(String a, String b) {
        /*int first = Integer.parseInt(a);
        int second= Integer.parseInt(b);*/
        StringBuilder ans = new StringBuilder("");

        int carry = 0;
        StringBuilder a1 = new StringBuilder(a);
        StringBuilder b1 = new StringBuilder(b);
        int requiredLength = a1.length() - b1.length();
        if (requiredLength>0) {
            for (int m = 0; m < requiredLength; m++) {
                b1.insert(m,'0');
            }

        } else {
            for (int m = 0; m < Math.abs(requiredLength); m++) {
                a1.insert(m,'0');
            }

        }


        int i = a1.length()-1;

        while (i >=0 ) {
            int first = 0;
            int second = 0;
            first = Integer.parseInt(String.valueOf(a1.charAt(i)));
            second = Integer.parseInt(String.valueOf(b1.charAt(i)));
            int add = carry + first + second;
            int data = add % 2;
            carry = add / 2;
            ans.append(data);
            i--;
        }
        if (carry == 1) {
            ans.append(carry);
        } else {
            System.out.println(ans);
        }
        System.out.println(ans);

    }
}
