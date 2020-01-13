package BitManipulation;

public class FlipAllBits {
    public static void main(String args[]) throws Exception {
        int test1 = 11;
        int flipped = FlipAllBits.flip(test1);
        System.out.println(flipped);
    }

    static int flip(int n) {
        // count no of bits => log2(n) + 1
        int noOfBits = (int)(Math.log(n)/Math.log(2)) + 1;

        for(int i=0;i<noOfBits;i++) {
            // flip the i+1 bit
            n = n ^ (1<<i);
        }
        return n;
    }
}
