package BitManipulation;

public class NoOfBitsRequired {
    public static void main(String args[]) throws Exception {
        int test1 = 11;
        int noOfBits = getNoOfBits(test1);
        System.out.println(noOfBits);

        int test2 = 32;
        noOfBits = getNoOfBits(test2);
        System.out.println(noOfBits);
    }

    static int getNoOfBits(int n) {
        // log2(n) + 1
        int noOfBits = (int)(Math.log(n)/Math.log(2)) + 1;
        return noOfBits;
    }
}
