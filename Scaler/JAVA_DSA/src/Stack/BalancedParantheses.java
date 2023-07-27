package Stack;
import Stack.StackImpl;
public class BalancedParantheses {
    public static void main(String[] args) {
        String exp="{(})[]";
        System.out.println(checkBalanced(exp));
    }

    private static boolean checkBalanced(String exp) {
        StackImpl<Character>stack= new StackImpl<>(Character.class,exp.length());
        for(int i=0;i<exp.length();i++){
            Character x= exp.charAt(i);
            if(x=='['|| x =='('|| x=='{'){
                stack.push(x);
            } else if (x==']') {
                if(stack.currentSize()>0 && stack.peek()=='['){
                    stack.pop();
                }else{
                    return false;
                }
            }else if (x==')') {
                if(stack.currentSize()>0 && stack.peek()=='('){
                    stack.pop();
                }else{
                    return false;
                }
            }else if (x=='}') {
                if(stack.currentSize()>0 && stack.peek()=='{'){
                    stack.pop();
                }else{
                    return false;
                }
            }

        }
        if(stack.currentSize()==0) {
            return true;
        }
        return false;

    }

}
