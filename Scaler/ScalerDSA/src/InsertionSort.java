import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr= {10,13,7,9,5,14};

        insertionsort(arr);
    }

    private static void insertionsort(int[] arr) {
       for(int i=1;i<arr.length;i++){
       for(int j=i-1;j>=0;j--){
           if(arr[j]>arr[j+1]){
               int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

           }
       }

       }
        System.out.println(Arrays.toString(arr));
    }

}
