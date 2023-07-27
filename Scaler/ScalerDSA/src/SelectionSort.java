import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr= {2,5,1,3,5,4,2};

        selectionsort(arr);
    }

    private static void selectionsort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            int minIndex=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int []arr,int i, int minIndex){
        int temp=arr[i];
         arr[i]= arr[minIndex];
         arr[minIndex]=temp;
    }
}
