public class DynamicProgramming {
    public static void main(String[] args) {
        int n=5;
        int[]dp=new int[n+1];

        System.out.println(count(n,dp));
    }
    static int count(int n, int[]dp){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(dp[n]!= 0){
            return dp[n];
        }
        dp[n]=count(n-1,dp)+count(n-2,dp);
        return dp[n];
    }
}
