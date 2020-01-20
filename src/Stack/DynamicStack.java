package Stack;

public class DynamicStack {
   private int arr[];
   private int top = -1;

    public DynamicStack(int n) {
        arr = new int[n];
    }

    public void push(int n) throws Exception {
        if(isFull()) {
            int size = arr.length*2;
            int arr2[] = new int[size];
            for(int i=0;i<arr.length;i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[++top] = n;
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return arr[top--];
    }

    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return (top == -1) ? true : false;
    }

    public boolean isFull() {
        return (top == arr.length-1) ? true : false;
    }

    public void print() {
        System.out.println("Printing stack elements");
        for(int i=top;i>=0;i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) throws Exception {
        DynamicStack s = new DynamicStack(5);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.print();
        s.pop();
        s.print();
    }

}
