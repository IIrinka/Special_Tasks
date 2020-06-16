package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.function.Function;

public class Pract {

    public static void main(String[] args) {
        int[] arr = new int[]{12,5,7,9,8};

//       TestArrSort(arr);
//       ArrSortWithoutSort(arr);
//       SortArrayDescending(arr);
       ChangeArrayFromEndToBegin(arr);

    }

    public static void ChangeArrayFromEndToBegin(int[] arr){
        System.out.println("Normal Array :: "+Arrays.toString(arr));
        int temp=0;
        for (int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println("Change Array :: "+Arrays.toString(arr));

    }

    public static void SortArrayDescending(int[] arr){
        Arrays.sort(arr);
        int[] arr2 =new int [arr.length];
        int j=0;
        for (int i = arr.length-1;i>=0;i--){
            arr2[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr2));
    }

public static void ArrSortWithoutSort(int[] arr){

        int temp=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(j<i){
                    temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                } } }
    System.out.println(Arrays.toString(arr));
}


    public static void TestArrSort(int[] arr){

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
