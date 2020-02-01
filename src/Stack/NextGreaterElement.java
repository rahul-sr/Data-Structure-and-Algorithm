package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String args[]) throws Exception {
        int[] test1 = new int[] {11, 13, 21, 3, 42, 5};
        nextGreater(test1);
        System.out.println();
        int[] test2 = new int[] {4, 5, 2, 25, 7, 32, 8, 6};
        nextGreater(test2);
    }

    public static int nextGreater(int arr[]) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++) {
            if(s.isEmpty() || arr[i] < s.peek()) {
                s.push(arr[i]);
            }
            else {
                while(!s.isEmpty()) {
                    int n = s.pop();
                    System.out.println(n + "=>" + arr[i]);
                }
                s.push(arr[i]);
            }
        }

        while (!s.isEmpty()) {
            int n = s.pop();
            System.out.println(n + "=> -" + 1);
        }

        return 0;
    }
}
