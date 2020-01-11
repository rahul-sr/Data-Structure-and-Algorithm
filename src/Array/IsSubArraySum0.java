package Array;

import java.util.HashMap;

public class IsSubArraySum0 {

    public static void main(String args[]) throws Exception {
        int test1[] = new int[] {3, 4, 3, -2, -5, 1, 3, 1, -4, -2, -2};
        Boolean isSum0 = IsSubArraySum0.isSum0(test1);
        System.out.println(isSum0);

        int test2[] = new int[] {3, 4, 3, 1, 2};
        isSum0 = IsSubArraySum0.isSum0(test2);
        System.out.println(isSum0);
    }

    static Boolean isSum0(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];

            if(map.get(sum) != null || sum == 0 || arr[i] == 0) {
                return true;
            }

            map.put(sum, i);
        }
        return false;
    }
}
