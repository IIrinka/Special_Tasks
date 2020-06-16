package Tasks;

public class Palindrome {

/*
Given a string s, find the longest palindromic substring in s. If string has spaces ignore them.
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
 */
public static void main(String[] args) {
    System.out.println(longestPalindrome("babad"));
}

public static boolean checkItPalindrome(String s){

    for (int i=0;i<s.length()/2;i++){

        if(s.charAt(i) != s.charAt(s.length()-1-i)){
            return false;
        }
    }
    return true;
}
public static String longestPalindrome(String s){
    String result ="";
    s=s.replace(" ","");

    for (int i=0;i<s.length();i++){
        for (int j=i;j<s.length();j++){
            if(checkItPalindrome(s.substring(i,j+1))){
                if(s.substring(i,j+1).length()>result.length()){
                    result=s.substring(i,j+1);
                }
            }
        }
    }


    return result;
}
}
