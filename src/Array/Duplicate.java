package Array;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {

    public static void main(String args[]) throws Exception {
        int a[] = new int[] {1,2,3,3,4,4,2,5,6,7,7};
        System.out.println(Duplicate.getDuplicate(a)); // [3,4,2,7]

        int b[] = new int[] {1,2,2,2,2,4,5,7,8,8};
        System.out.println(Duplicate.getDuplicate(b)); // [2,8]
    }

    public static List getDuplicate(int n[]){

        List<Integer> duplicates = new ArrayList<>();
        int[] duplicateIndex = new int[n.length];

        for(int i=0;i<n.length;i++) {
          int val = Math.abs(n[i]);
          if(n[val-1] < 0 && duplicateIndex[val] == 0){
              duplicateIndex[val]=1;
              duplicates.add(val);
          } else {
              n[val-1] = n[val-1]*(-1);
          }
        }

        return duplicates;
    }

}

