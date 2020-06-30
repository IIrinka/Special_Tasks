package Tasks;

import java.util.Arrays;

public class Sort_Array {
    public static void main(String[] args) {

        int[] arr = {12,2,34,3,12,4,2,4};   //  Sort Array without Sort
        System.out.println(Arrays.toString(arr));

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

        int[] nums = {12,2,34,3,12,4,2,4};   //    change array from end to beginning NO SORT
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

        result = result.substring(0, result.length()-2)+"]";
        System.out.println(result);
        System.out.println("==============================");
// write a return method that accepts an int array and sorts it in descending order
        int[] arr2 = { 99,10,200, 3000, 40, 50, 5000};
        Arrays.sort(arr2);  //  array will be sorted in Acsending order

        int[] Descendning = new int[arr2.length];
        int z=0;
        for(int i = arr2.length-1; i >=0; i-- ) {
            Descendning[ z ] = arr2[i];
            z++;
        }
        System.out.println( "Ascending order: "+ Arrays.toString(arr2));
        System.out.println("Descedning order: "+Arrays.toString(Descendning));

    }
    public static void SortWithWile(int[] arr){
        int temp = 0;
        boolean check = true;
        while (check) {
            check = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    check = true;
                } } }
        System.out.println(Arrays.toString(arr));
    }
}
