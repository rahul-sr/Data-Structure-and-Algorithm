package Array;

public class Swap3VariablesWithoutTemp {
    public static void main(String args[]) throws Exception {
        Swap3VariablesWithoutTemp.swap(10, 20, 30);
    }

    // a,b,c  a=c, b=a, c=b
    static void swap(int a, int b, int c) {
        a = a+b+c;
        
        b = a-b-c;  // a+b+c-b-c = a
        c = a-b-c; // a+b+c-a-c = b
        a = a-b-c;  // a+b+c-a-b = c

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
