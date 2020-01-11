package Array;

public class MaxProductOf2 {
    public static void main(String args[]) throws Exception {
        int test1[] = new int[] {-10, -3, 5, 6, -2};
        int product = MaxProductOf2.maxProduct(test1);
        System.out.println(product);

        int test2[] = new int[] {5, 6, 7, 8, -10, -20};
        product = MaxProductOf2.maxProduct(test2);
        System.out.println(product);
    }

    static int maxProduct(int arr[]) {
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] < min) {
                secMin = min;
                min = arr[i];
            }
            if(arr[i] > max) {
                secMax = max;
                max = arr[i];
            }
        }

        int maxProduct = Math.max(min*secMin, max*secMax);
        return maxProduct;
    }
}
