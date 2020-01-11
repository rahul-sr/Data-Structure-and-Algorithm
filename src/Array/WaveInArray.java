package Array;

import java.util.Arrays;

public class WaveInArray {
    public static void main(String args[]) throws Exception {
        int test1[] = new int[] {10, 4, 3, 5 , 6, 3, 8 , 1};
        int result[] = WaveInArray.createWave(test1);
        System.out.println(Arrays.toString(result));

        int test2[] = new int[] {1, 3, 6, 3, 7, 8, 9, 3, 4, 7, 2, 4};
        result = WaveInArray.createWave(test2);
        System.out.println(Arrays.toString(result));
    }

    // max min max min max min ...
    static int[] createWave(int arr[]) {
        for(int i=0;i<arr.length;i=i+2){
            if(i<arr.length-1 && arr[i] < arr[i+1]) {
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
            if(i>0 && arr[i] < arr[i-1]) {
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }
}
