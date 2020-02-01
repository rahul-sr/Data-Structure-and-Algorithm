package Stack;

import java.util.Stack;

public class SortStackWithRecursion {
    public static void main(String args[]) throws Exception {
        Stack<Integer> s = new Stack<Integer>();
        s.push(8);
        s.push(3);
        s.push(2);
        s.push(5);
        s.push(1);

        sort(s);
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void sort(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }

        int n = s.pop();
        sort(s);
        insertInSortedOrder(s, n);
    }

    private static void insertInSortedOrder(Stack<Integer> s, int n) {
        if(s.isEmpty()) {

        }
    }
}
