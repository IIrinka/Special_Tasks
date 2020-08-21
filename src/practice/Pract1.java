package practice;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Pract1 {

    public static void main(String[] args) {
        Test(300);
    }


    public static void Test(int num){

        int x=0,y=1,sum=0;

        while (x<=num){
            System.out.print(x);
            sum=x+y;
            x=y;

            y=sum;
            if (x<=num){
                System.out.print(" - ");
            }
        }


    }


}
