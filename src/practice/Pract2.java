package practice;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Pract2 {

    public static void main(String[] args) {

        int[] in = {2, 7, 2, 2, 7, 7};
        System.out.println(has77(in));

    }


    public static boolean has77(int[] nums) {
        boolean found1 = false;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1)
                found1 = true;

            if(found1 && nums[i] == 2)
                return true;
        }

        return false;
    }



}
