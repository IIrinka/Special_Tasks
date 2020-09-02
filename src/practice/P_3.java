package practice;

import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;


public class P_3 {


        // Driver method
        public static void main(String[] args) {

            Integer[] arr = {2,4,3,6,78,3,2,1,2};
            Test(arr);

        }

        public static void Test(Integer[] arr){

            Set<Integer> set = new TreeSet<>(Arrays.asList(arr));

            Integer[] newArr = set.toArray(new Integer[]{});
            System.out.println(Arrays.toString(newArr));

        }


}