package Stack;
import Stack.MergeStack.*;
public class SortStackMergeSort {
    public static void main(String[] args) {
        StackImpl<Integer>stack1= new StackImpl<>(Integer.class,9);
        stack1.push(3);
        stack1.push(5);
        stack1.push(10);
        stack1.push(15);
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(7);
        stack1.push(9);
        mergeSort(stack1);
    }

    private static StackImpl<Integer> mergeSort(StackImpl<Integer> stack1) {
        if(stack1.currentSize()<=1){
            return stack1;
        }
        StackImpl<Integer>stack2= new StackImpl<>(Integer.class,stack1.currentSize()/2);
        for(int i=0;i<stack1.currentSize()/2;i++){
            stack2.push(stack1.pop());
        }
        stack1=mergeSort(stack1);
        stack2=mergeSort(stack2);
        return MergeStack.merge(stack1,stack2);
    }
}
