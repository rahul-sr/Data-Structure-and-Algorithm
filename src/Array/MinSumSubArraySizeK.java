package Array;

public class MinSumSubArraySizeK {

    public static void main(String args[]) throws Exception {
        int test[] = new int[] {10, 10, 4, 3, 5 , 6, 3, 8 , 1};
        int result[] = MinSumSubArraySizeK.getMinSum(test, 3);
        System.out.println("Minimum sum is: " + result[0]);

        System.out.print("Minimum sum subarray elements are: ");
        for(int i= result[1]; i<=result[2]; i++) {
            System.out.print(test[i] + " ");
        }
    }

    static int[] getMinSum(int arr[], int k) {
        int sum = 0;
        int result[] = new int[3];

      //  result[0] => minSum
      //  result[1] => subArrayLowerIndex
      //  result[2] => subArrayUpperIndex

        for(int i=0; i< Math.min(k, arr.length); i++) {
            sum += arr[i];
        }

        result[0] = sum;
        result[1] = 0;
        result[2] = k;

        for(int i=k; i<arr.length; i++) {
            sum = sum + arr[i] - arr[i-k];
            if(sum < result[0]) {
                result[0] = sum;
                result[1] = i-k+1;
                result[2] = i;
            }

        }

        return  result;
    }

}
