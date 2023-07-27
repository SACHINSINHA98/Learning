package Stack;
import Stack.StackImpl;

import java.lang.reflect.Array;

public class StackImpl<T> {
    T[] arr;
    int capacity;
    int top;

    StackImpl(Class<T>clazz,int size) {
        arr = (T[]) Array.newInstance(clazz, size);
        capacity = size;
        top = -1;
    }

    void push(T element) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = element;
        }
    }

    private boolean isFull() {
        if (top == capacity - 1) {
            return true;
        }
        return false;
    }

    T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty enter element first");
            return null;
        } else {
            T popped = arr[top];
            top--;
            return popped;
        }

    }

    private boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    int currentSize() {
        return top + 1;
    }

    T peek() {
        if (isEmpty()) {
            return null;
        } else {
           return arr[top];
        }

    }

    void printStack() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.print("[");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i]);
                System.out.print(" ");
            }
            System.out.println("]");
        }

    }
}

class StackDryRun {
    public static void main(String[] args) {
        StackImpl<Integer> stack = new StackImpl( Integer.class,4);
        stack.push(1);
        //stack.printStack();
        //stack.pop();
        stack.push(2);
        stack.push(3);
        stack.push(4);

       stack.printStack();
//        stack.push("sm");
//        //stack.printStack();
//        stack.pop();
//        stack.printStack();
//        stack.currentSize();
        stack.peek();
    }
}