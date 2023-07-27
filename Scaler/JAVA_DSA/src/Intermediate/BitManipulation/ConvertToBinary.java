package Intermediate.BitManipulation;

public class ConvertToBinary{
    public static void main(String[] args) {
        int a=15;
        StringBuilder builder= new StringBuilder();
        while(a>0){
            builder.append(a%2);
            a=a/2;
        }
        System.out.println(builder.reverse());
    }
}
