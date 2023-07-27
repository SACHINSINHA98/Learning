package Stack;
import Stack.StackImpl;

public class InfixToPostfix {
    public static void main(String[] args) {
        String exp="(2+(4-1)*5)+(6*(5-1))";
        StringBuilder str=new StringBuilder(exp.length());
        postfix(exp,str);
    }

    private static void postfix(String exp,StringBuilder str) {
        StackImpl<Character>stack= new StackImpl<>(Character.class,exp.length());
        for(int i=0;i<exp.length();i++){
            char x= exp.charAt(i);
            if(x=='('){
                stack.push(x);
            }else if(Character.isDigit(x)){
                str.append(x);
            }else if (x==')'){
                while(stack.peek()!='(' ){
                    str.append(stack.pop());
                }
                stack.pop();
            }else{
                if(stack.currentSize()==0 || precedence(x)> precedence(stack.peek())){
                    stack.push(x);
                }else if(precedence(x)<=precedence(stack.peek())){
                    while(stack.currentSize()>0 && precedence(stack.peek())>=precedence(x)){
                        str.append(stack.pop());
                    }
                    stack.push(x);
                }
            }
        }
        if(stack.currentSize()>0){
            while(stack.currentSize()>0){
                str.append(stack.pop());
            }
        }
        System.out.println(str);
    }
    static int  precedence(Character ch){
        int priority=0;
        if (ch=='+' || ch=='-'){
            priority=1;
        }
        if(ch=='*' || ch=='/'){
            priority=2;
        }
        return priority;
    }

}
