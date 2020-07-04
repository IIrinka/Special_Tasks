package tasks;

import java.util.HashMap;
import java.util.Map;

public class RemuveDuplicatedAndFriquencyOfCharacters {
    public static void main(String[] args) {

        System.out.println( remuveDuplicate("aaadddkkkmmm"));   //  OUTPUT:   adkm
        System.out.println(frequency("AAAABBBCC",'A'));     //  OUTPUT:   4
        friquencyOfCharacters("AAADDDRRRTTT");                  //  OUTPUT:   A3 D3 R3 T3

        System.out.println("===================================");
        String str = "AAAABBBBBBBBACCRDDD";  // Count char frequency and store it in Map
        Map<Character,Integer> charFreq = new HashMap<>();
        for(int x= 0;x<str.length();x++){
            if(!charFreq.containsKey(str.charAt(x))){
                System.out.println("Enter for the first time  " + str.charAt(x));
                charFreq.put(str.charAt(x),1);
            }else {
                charFreq.replace(str.charAt(x),charFreq.get(str.charAt(x))+1);
            } }
        System.out.println("charFreq = " + charFreq);
        System.out.println("======================================");

    }
    public static String remuveDuplicate(String str){  //  TASK:  RemoveDuplicate("aaabbbccc") ==> "abc"
        String result1="";
        for(int i=0;i<str.length();i++){
            if(!result1.contains(""+str.charAt(i))) {
                result1+= str.charAt(i); } }
        return result1;
    }
    public static int frequency(String str, char ch){  // TASK:  Frequency("AAABBB", 'A') ==> 3
        int count = 0;
        char[] arr = str.toCharArray();
        for(char each : arr){
            if(each == ch){
                count++;
            } } return count;
    }
    public static void friquencyOfCharacters(String str) {  // TASK:  FrequencyOfChars("CCAAABBBCCCC")  ==>"A3B3C6"
        String nonDup = remuveDuplicate(str);
        for(int i=0;i<nonDup.length();i++){
            int count =frequency(str,nonDup.charAt(i));
            System.out.print(""+nonDup.charAt(i)+count+" ");   }
    }}