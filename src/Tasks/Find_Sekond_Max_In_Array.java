package Tasks;

import java.util.Arrays;

public class Find_Sekond_Max_In_Array {

        public static void main(String[] args) {



            int[] arr = {1,2,5,3,8,7,9,4};  //  Write a code to find the second highest number in this array
            int max=0;
            int sekMax =0;
            for (int i=0;i<arr.length;i++) {
                if (arr[i] > max) {
                    sekMax=max;
                    max = arr[i];
                }}
            System.out.println(max);
            System.out.println(sekMax);

            System.out.println("=============================");

            int[] arr2 = {1,2,5,3,8,7,9,4};
            int temp =0;
            for(int i=0;i<arr2.length;i++) {
                for (int j = i + 1; j < arr2.length; j++) {
                    if (arr2[i] > arr2[j]) {
                        temp=arr2[i];                           //sort array
                        arr2[i]=arr2[j];
                        arr2[j]=temp; } } }
            System.out.println(Arrays.toString(arr2));
            System.out.println(arr2[arr2.length-2]);
            System.out.println("============================");
            int[] arr3 = {1,2,5,3,8,7,9,4};
            Arrays.sort(arr);                                   //sort array
            System.out.println("second biggest num = " + arr[arr.length-2]);
            System.out.println("============================");
            int[] arr4 = { 20, 200, 30, 40, 50, 500 };
            int maximum = 0; // max =20, max = 200
            for(int i=0; i < arr.length; i++ ) {
                if(arr[i] > maximum) {
                    maximum = arr[i];
                } }
            System.out.println("Maximum number is: " + maximum);
            int secondMax = 0;
            for(int j =0; j < arr.length; j++) {
                if(arr[j] > secondMax && arr[j] != maximum) {
                    secondMax = arr[j];
                } }
            System.out.println("Second maximum number is: "+secondMax);
            System.out.println("============================");

            int[] nums  = {2000, 90, 89, 78, 65, 5555, 444, -5};
            Arrays.sort( nums );
            System.out.println(Arrays.toString(nums));
            System.out.println("Minimum number: " + nums[0] );
            System.out.println("Maximum Number: "+ nums [ nums.length-1 ]);
            System.out.println("Second Maximum Number: " + nums [ nums.length-2 ]);
            System.out.println("Second Minimum Number: "+ nums[1]);
        }
    }

