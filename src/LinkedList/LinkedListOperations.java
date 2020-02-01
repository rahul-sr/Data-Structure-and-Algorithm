package LinkedList;

public class LinkedListOperations {
    public static Node head = null;

    static class Node {
        public int data;
        public Node next;

        public Node(int value) {
            this.data = value;
            this.next = null;
        }
    }


    public static void main(String args[]) throws Exception {
        LinkedListOperations list = new LinkedListOperations();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        list = insertAtBeginning(list, node2);
        print(list);

        list = insertAtBeginning(list, node1);
        print(list);

        list = insertAtEnd(list, node3);
        print(list);

        list = insertAtEnd(list, node4);
        print(list);

        int s = size(list);
        System.out.print(s);
    }

    // Insert at Begining
    public static LinkedListOperations insertAtBeginning(LinkedListOperations list, Node node) {
        if(list.head == null) {
            list.head = node;
        } else {
           Node temp =  list.head;
           list.head = node;
           list.head.next = temp;
        }
        return list;
    }

    // Insert at End
    public static LinkedListOperations insertAtEnd(LinkedListOperations list, Node node) {
        if(list.head == null) {
            list.head = node;
        } else  {
            Node temp =  list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }

        return list;
    }

    // Print elements of linked list
    public static void print(LinkedListOperations list) {
        Node temp = list.head;
        if(temp == null) {
            return;
        }
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }

    // Search by Value
    public static Node searchByValue(LinkedListOperations list, int value) {
        Node temp = list.head;
        while (temp != null) {
            if(temp.data == value) {
                return temp;
            }
        }
        return null;
    }

    // Search By Index
    public static Node searchByIndex(LinkedListOperations list, int index) {
        return null;
    }

    // Delete By value
    public static void deleteByValue() {

    }

    // Delete By Index
    public static void deleteByIndex() {

    }

    // Sort
    public static void sort() {

    }

    // Reverse using recursion
    public static void reverseUsingRecursion() {

    }

    // Reverse using iteration
    public static void reverseUsingIteration() {

    }

    // Size of linkedList
    public static int size(LinkedListOperations list) {
        Node temp = list.head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

}
