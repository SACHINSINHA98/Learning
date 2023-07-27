package Stack;
import Stack.StackImpl;
public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String str= "ssaabbba";
        StackImpl<Character> stack =new StackImpl<>(Character.class,str.length());
        for(int i=0;i<str.length();i++){
            if(stack.peek()==null){
                stack.push(str.charAt(i));

            }else if(stack.peek()!=str.charAt(i)){
                stack.push(str.charAt(i));

            }else{
                stack.pop();
            }
            stack.printStack();
        }


    }
}
