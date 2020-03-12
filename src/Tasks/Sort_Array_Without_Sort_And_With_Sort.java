package Tasks;

import java.util.Arrays;

public class Sort_Array_Without_Sort_And_With_Sort {
    public static void main(String[] args) {

        int[] arr = {12,2,34,3,12,4,2,4};   //  Sort Array without Sort
        System.out.println(Arrays.toString(arr));
        int count =0;
        int temp=0;
        for(int i = 0; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                } } }
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("==============================");

        int[] nums = {12,2,34,3,12,4,2,4};   //    change array from end to beginning
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length/2;i++){
            temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("==============================");

        int[]  MyNumbers = { 99,10,200, 3000, 40, 50, 5000};
        Arrays.sort(MyNumbers);
        System.out.println( Arrays.toString(MyNumbers) );

        String result ="[";
        for(int i = MyNumbers.length-1; i  >= 0; i--) {
            result += MyNumbers[i] + ", ";
        }
        System.out.println();
        result = result.substring(0, result.length()-2)+"]";
        System.out.println(result);
        System.out.println("==============================");

        int[] arr2 = { 99,10,200, 3000, 40, 50, 5000};
        Arrays.sort(arr2);  //  array will be sorted in Acsending order

        int[] Decedning = new int[arr2.length];
        int z=0;
        for(int i = arr2.length-1; i >=0; i-- ) {
            Decedning[ z ] = arr2[i];
            z++;
        }
        System.out.println( "Ascending order: "+ Arrays.toString(arr2));
        System.out.println("Descedning order: "+Arrays.toString(Decedning));

    }
}
