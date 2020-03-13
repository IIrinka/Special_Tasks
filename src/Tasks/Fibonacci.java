package Tasks;

import java.util.Scanner;

public class Fibonacci {

        public static void main(String[] args){


            Scanner scan = new Scanner(System.in);
            int x =scan.nextInt();

            int  y = 0, z = 1;

            System.out.print("Upto " + x + ": ");
            while (y <= x)
            {
                System.out.print(y );

                int sum = y + z;
                y = z;
                z = sum;
                if(y <= x){
                    System.out.print(" + ");}
            }
        }
    }

