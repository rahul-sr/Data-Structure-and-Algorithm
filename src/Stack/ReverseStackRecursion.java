package Stack;

import java.util.Stack;

public class ReverseStackRecursion {
    public static void main(String args[]) throws Exception {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        // s => 5,4,3,2,1
        reverse(s);
        // s => 1,2,3,4,5

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int n = s.pop();
        reverse(s);

        insertAtBottom(s, n);
    }

    private static void insertAtBottom(Stack<Integer> s, int n) {
        if(s.isEmpty()) {
            s.push(n);
            return;
        }

        int e = s.pop();
        insertAtBottom(s, n);
        s.push(e);
    }
}
