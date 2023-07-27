import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int []arr1={2,5,7,12,20,24,29};
        int []arr2={6,9,10,14,18,19};

        merge(arr1,arr2);
    }

    private static void merge(int[] arr1, int[] arr2) {
        int []arr3=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]) {
                arr3[k]=arr1[i];
                i++;
                k++;
            }else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(i<arr2.length){
            arr3[k]=arr2[i];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr3));
    }

}
