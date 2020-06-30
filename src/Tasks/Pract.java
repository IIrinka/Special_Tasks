package Tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.function.Function;

public class Pract {

    public static void main(String[] args) {
        int[] arr = {2,1,4,6,5,3};
        int[] arr1 = {2,1,4,6,5,3,8};
        int[] arr2 = {-1,-3};
        SortArray(arr);
        System.out.println(Test(arr));
        System.out.println(Test(arr1));
        System.out.println(Test(arr2));
        Fibonacci(300);
    }
    public static void SortArray (int[] arr){

        int temp = 0;
        boolean check = true;
        while (check){
            check =false;
            for (int i=0;i<arr.length-1;i++){
            if (arr[i] > arr[i+1]) {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                check=true;
            }
        }}
        System.out.println(Arrays.toString(arr));
    }

    public static int Test(int [] arr){
        int num = 0;
        Arrays.sort(arr);
        if(arr[arr.length-1]<0){
            num=1;
            return num;
        }
        for (int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]<2){
                continue;
            }else {
                return arr[i]+1;
            } }
        return arr[arr.length-1]+1;
    }

    public static void Fibonacci(int num){
        int x=0,y=1,sum=0,last=0;
        while (x<=num){
            System.out.print(x);
            last=x;
            sum=x+y;
            x=y;

            y=sum;
            if(x<num){
                System.out.print(" - ");
            }
        }
        System.out.println("\nLast = "+last);

    }

}
