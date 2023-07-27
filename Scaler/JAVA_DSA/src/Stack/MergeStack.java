package Stack;
import Stack.StackImpl;


public class MergeStack {
    public static void main(String[] args) {
        StackImpl<Integer>stack1= new StackImpl<>(Integer.class,4);
        StackImpl<Integer>stack2=new StackImpl<>(Integer.class,5);
        stack1.push(3);
        stack1.push(5);
        stack1.push(10);
        stack1.push(15);
        stack2.push(2);
        stack2.push(4);
        stack2.push(6);
        stack2.push(7);
        stack2.push(9);
        merge(stack1,stack2);
    }

     static StackImpl<Integer> merge(StackImpl<Integer> stack1, StackImpl<Integer> stack2) {
        StackImpl<Integer>stack3= new StackImpl<>(Integer.class,stack1.capacity+ stack2.capacity);
        while(stack1.currentSize()>0 && stack2.currentSize()>0){
            if(stack1.peek()>stack2.peek()){
                stack3.push(stack1.pop());
            }else{
                stack3.push(stack2.pop());
            }
        }
        if(stack1.currentSize()==0){
            while (stack2.currentSize()>0){
                stack3.push(stack2.pop());
            }
        }
        if(stack2.currentSize()==0){
            while (stack1.currentSize()>0){
                stack3.push(stack1.pop());
            }
        }
        stack3.printStack();
        return reverse(stack3);
    }

    private static StackImpl<Integer> reverse(StackImpl<Integer> stack3) {
        StackImpl<Integer>stack4= new StackImpl<>(Integer.class,stack3.capacity);
        while(stack3.currentSize()>0){
            stack4.push(stack3.pop());
        }
        stack4.printStack();
        return stack4;
    }
}
