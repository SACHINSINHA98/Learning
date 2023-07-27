package TwoPointers;

public class MinimizeThreeArrayDiff {
    public static void main(String[] args) {
        int []arr1={3,14,16,20,29,40};
        int []arr2={-6,23,24,30,35,50};
        int []arr3={-15,15,26,31,39,42};

        System.out.println(findMinDiff(arr1, arr2, arr3));
    }

    private static int findMinDiff(int[] arr1, int[] arr2, int[] arr3) {
        int p1=0;
        int p2=0;
        int p3=0;
        int minDiff=Integer.MAX_VALUE;
        while(p1<arr1.length && p2<arr2.length && p3<arr3.length){
            int max= Math.max(Math.max(arr1[p1],arr2[p2]),arr3[p3]);
            int min =Math.min(Math.min(arr1[p1],arr2[p2]),arr3[p3]);
            int diff=max-min;
            minDiff=Math.min(diff,minDiff);
            if(min==arr1[p1]){
               p1++;
            }else if(min==arr2[p2]){
                p2++;
            }else{
                p3++;
            }
        }
        return minDiff;
    }


}
