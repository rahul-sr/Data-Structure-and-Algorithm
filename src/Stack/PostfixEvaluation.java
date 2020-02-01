package Stack;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String args[]) throws Exception {
        String exp1 = "2 3 1 * + 9 -";
        System.out.println(evaluate(exp1));
        String exp2 = "5 10 2 * + 3 -";
        System.out.println(evaluate(exp2));
    }

    static int evaluate(String exp) {
        int result = 0;

        Stack<Integer> s = new Stack<>();
        for(int i=0;i<exp.length();i++) {
            char c = exp.charAt(i);
            if(c == ' ') {
                continue;
            }
            else if(c >= 48 && c <= 57) {
                int n = 0;
                while(c >= 48 && c <= 57)
                {
                    n = n*10 + (int)(c-'0');
                    i++;
                    c = exp.charAt(i);
                }
                i--;
                s.push(n);
            } else {
                int op1=s.pop(), op2=s.pop();
                if(c == '*') {
                    result = op2 * op1;
                }
                else if(c == '/') {
                    result = op2 / op1;
                }
                else if(c == '+') {
                    result = op2 + op1;
                }
                else if(c == '-') {
                    result = op2 - op1;
                }
                s.push(result);
            }
        }
        return result;
    }
}
