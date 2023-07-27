package Advanced.BinarySearch;

public class AthMagicalNumber {
    public static void main(String[] args) {
       magicalNumber(4,2,3);
    }

    private static void magicalNumber(int A, int B, int C) {
        int start=1;
        int end=B*C;
        int count=0;
        int ans=0;

        while(start<=end){
                int mid=(start+end)/2;
                if(mid%2==0 || mid%3==0){
                    ans=mid;
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        System.out.println(ans%1000000007);
    }
}
