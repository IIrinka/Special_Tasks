package tasks;

import java.util.Arrays;

public class Pract {

    public static void main(String[] args) {
        int[] arr = {2,1,4,6,5,3};
        int[] arr1 = {2,1,4,6,5,3,8};
        int[] arr2 = {-1,-3};
       Fibonacci(300);
        System.out.println();
       Test69(9669);
        System.out.println();
        ArrSort(arr);
        ArrSort2(arr);



    }
    public static void divider(final int a, final int b) {
        int num1 = a;
        int count = 0;
        while(num1>b){
            num1 = num1-b;
            count++;
        }
        System.out.println("Result is " + count +" and remainder is " + num1);
    }

    public static int getUniqueIndex(String str){
        for(int i=0; i < str.length(); i++){
            int count = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    ++count;
                }
            }
            if(count==1){
                return i;
            }
        }
        return -1;
    }


    public static void Fibonacci(int num){
        int x=0,y=1,summ=0;
        while (x<=num){
            System.out.print(x);
            summ=x+y;
            x=y;
            y=summ;
            if(x<=num){
                System.out.print(" - ");
            }
        }
    }

    public static void Test69(int num){

        String str="";
        int result=0;
        boolean check=true;
        String[] arr=String.valueOf(num).split("");
        for (int i=0;i<arr.length;i++){
            if(arr[i].equals("6") && check){
                arr[i]="9";
                check=false;
            }
            str+=arr[i];
        }
        result=Integer.parseInt(str);
        System.out.println(result);

    }

    public static void ArrSort(int[] arr){
        boolean check=true;
        int temp=0;
        while (check){
            check=false;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    check=true;
                } } }
        System.out.println(Arrays.toString(arr));
    }

    public static void ArrSort2(int[] arr){
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));


    }

}
