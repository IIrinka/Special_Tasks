package Tasks;

import java.util.Arrays;
import java.util.TreeSet;

public class Remuve_Duplicated_And_Friquency_Of_Characters_3 {
    public static void main(String[] args) {

// solution 1:  beeg one
        String a ="aabbbc",  b ="cabbccaabbbaa" ;  //  Remove all duplicate and compare
        String a1 = "" ;
        for(int j= 0; j < a.length(); j++) {
            if(!a1.contains( a.substring(j, j+1)  )  ) {
                a1 += a.substring(j, j+1) ;
            } }
        System.out.println(a1);     // a1 ="abc"

        String b1 = "";
        for(int i=0; i < b.length(); i++ ) {           //   one loop remove duplicates
            if(! b1.contains( ""+b.charAt(i) )) {
                b1 += ""+b.charAt(i);
            } }
        System.out.println(b1);  //      b1 ="cab"

        char[] ch1 = a1.toCharArray();  // String -->char[]
        char[] ch2 =b1.toCharArray();
        Arrays.sort(ch1);   //  sort
        Arrays.sort(ch2);

        String str1 = Arrays.toString(ch1);   //  char[] -->String
        String str2 = Arrays.toString(ch2);

        if(str1.equals(str2)) {
            System.out.println("True, they are build out of same letetrs");
        } else {
            System.out.println("False, different letters");
        }
        System.out.println("====================================");

        // solution 2:  short
        String Str1 = "cccccaaaabbbbcccbbbbbbb" , Str2 = "cccaaabbbccc";    //   !!!!!!!!!
        Str1 = new TreeSet<String>( Arrays.asList( Str1.split(""))).toString();
        Str2 = new TreeSet<String>( Arrays.asList( Str2.split(""))).toString();
        System.out.println(Str1.equals(Str2));
        System.out.println("====================================");

        String str = "aabbaaabbbcccccDDaaEEE";
        String RemoveDup = "";
        for(int i=0; i < str.length(); i++) {
            if( ! RemoveDup.contains( str.substring(i, i+1)) ) {
                RemoveDup += str.substring(i, i+1);
            } }
        System.out.println(RemoveDup);
        String result ="";
        for(int j=0; j < RemoveDup.length(); j++) {
            int count =0;
            for(int i=0; i < str.length(); i++) {
                if( str.substring(i, i+1).equals( RemoveDup.substring(j, j+1)) ) {
                    count++;
                } }
            result += RemoveDup.substring(j, j+1) + count;
        }
        System.out.println(result);
        System.out.println("====================================");

        String str3 = "AAABBCCDD";   // expected result = "A2B2C2D2";
        String expectedResult = "";
        for(int j=0; j < str3.length(); j++) {
            int count = 0;
            for(int i=0; i < str3.length(); i++) {
                if(str3.charAt(i) == str3.charAt(j)) {
                    count++;
                } }
            expectedResult += ""+str3.charAt(j) + count;
            str3 = str3.replace(""+str3.charAt(j) ,  "" );
        }
        System.out.println(expectedResult);

    }
}
