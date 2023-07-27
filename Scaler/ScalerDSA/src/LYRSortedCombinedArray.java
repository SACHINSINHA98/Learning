import java.util.Arrays;
import java.util.Scanner;

public class LYRSortedCombinedArray {
    public static void main(String[] args) {
        int []arr={8,1,3,6,11,2,4,9,7,6};
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int y=sc.nextInt();
        int r=sc.nextInt();
        sortAccordingLYR(arr,l,y,r);
    }

    private static void sortAccordingLYR(int[] arr,int l,int y, int r) {
        int a=l;
        int b=y;
        int arr2[]= new int[r-l+1];
        int k=0;
        while(a<y && b<=r){
            if(arr[a]<arr[b]){
                arr2[k]=arr[a];
                a++;
                k++;
            }else{
                arr2[k]=arr[b];
                b++;
                k++;
            }

        }
        while(a<y){
            arr2[k]=arr[a];
            a++;
            k++;
        }
        while(b<=r){
            arr2[k]=arr[b];
            b++;
            k++;
        }

       for(int m=0;m<arr2.length;m++){
           arr[m+l]=arr2[m];
       }
        System.out.println(Arrays.toString(arr));
    }

}

