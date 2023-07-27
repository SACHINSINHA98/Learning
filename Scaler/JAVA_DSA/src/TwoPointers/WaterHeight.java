package TwoPointers;

public class WaterHeight {
    public static void main(String[] args) {
        int[] arr={3,5,4,7,3,6,5,4,1,2};
        System.out.println(findMaxWater(arr));
    }

    private static int findMaxWater(int[] arr) {
        int p1=0;
        int p2=arr.length-1;
        int max=0;
        while(p1<p2){
            int height=Math.min(arr[p1],arr[p2]);
            int width=p2-p1;
            int area= height*width;
            max=Math.max(area,max);
            if(height==arr[p1]&& arr[p1]!=arr[p2]){
                p1++;
            }else{
                p2--;
            }
        }

return max;
    }
}
