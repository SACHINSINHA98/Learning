package Stack;

import java.util.ArrayList;
//similar questions
//nearest smallest on left side distance
//nearest smaller on right side// in this we can iterate from reverse
//nearest greater on left// changing of if conditions
//nearest greater on right// reverse and check conditions as per previous question
public class FindNearestSmallest {
    public static void main(String[] args) {
        int []arr={3,8,7,10,18,1,0,2};
        nearestSmallest(arr);
    }
    // if we want index run commented code
    private static void nearestSmallest(int[] arr) {
        StackImpl<Integer>stack= new StackImpl<>(Integer.class,arr.length);
        ArrayList<Integer>list= new ArrayList<>();
        //stack.push(0);
        stack.push(arr[0]);
        list.add(-1);
        for(int i=1;i<arr.length;i++){
            //if(stack.currentSize()>0 && arr[stack.peek()]<arr[i]){
                if(stack.currentSize()>0 && stack.peek()<arr[i]){
                list.add(stack.peek());
                stack.push(arr[i]);
                //stack.push(i);
            }else{
                //while(stack.currentSize()>0 && arr[stack.peek()]>=arr[i]){
                    while(stack.currentSize()>0 && stack.peek()>=arr[i]){
                    stack.pop();
                }
                if(stack.currentSize()>0){
                    list.add(stack.peek());
                    stack.push(arr[i]);
                    //stack.push(i);
                }else {
                    list.add(-1);
                    stack.push(arr[i]);
                    //stack.push(i);
                }

            }

        }
        System.out.println(list);
    }
}
