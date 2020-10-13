package practice;

import com.sun.jdi.Value;
import org.junit.Test;


import java.util.*;


public class Pract1 {

    public static void main(String[] args)  {


    }

public static void fix45(String nums)
{
    boolean length = nums.length()>=8;
    boolean digits = nums.matches(".*[1-9].*");
    boolean smallL = nums.matches(".*[a-z].*");
    boolean bigL =nums.matches(".*[A-Z].*");
    boolean special = nums.matches(".*[,.!@$&#].*");
    boolean result = length && digits &&smallL && bigL && special;
    if(result){
        System.out.println("Log In Successful");
    }else {
        System.out.println("Ups");
    }

    }
}