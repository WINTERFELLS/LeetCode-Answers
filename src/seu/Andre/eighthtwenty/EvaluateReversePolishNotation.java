package seu.Andre.eighthtwenty;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                s.push(s.pop()+s.pop());
            }else if(tokens[i].equals("-")){
                s.push(-s.pop() + s.pop());
            }else if(tokens[i].equals("*")){
                s.push(s.pop() * s.pop());
            }else if(tokens[i].equals("/")){
                int n1 = s.pop(); 
                int n2 = s.pop();
                s.push(n2 / n1);
            }else{
                int temp = Integer.parseInt(tokens[i]);
                s.push(temp);
            }
        }
        return s.pop();
    }
}
