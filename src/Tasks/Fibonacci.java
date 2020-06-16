package Tasks;

import java.util.Scanner;

public class Fibonacci {

        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);
            int x =scan.nextInt();
            int  y = 0, z = 1, sum=0,last=0;
            System.out.print("Upto " + x + ": ");
            while (y <= x)
            {
                System.out.print(y );
             last= y;
               sum = y + z;
                y = z;
                z = sum;
                if(y <= x){
                    System.out.print(" + ");}
            }
            System.out.println("\n last element :: "+last);
        }
    }

