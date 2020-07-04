package tasks;

public class Remuve_Digit_From_String {
    public static void main(String[] args) {
        String str = "asdf4kjk5kj3j233jkl";
    }

    public static void RemuveDidgitFromString(String str){

        String s1 = "";
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                s1+=str.charAt(i);
                int eachNum = Integer.parseInt(str.charAt(i)+"");
                sum+=eachNum;
            } }
        System.out.print(sum+"\n");
        System.out.print(s1+" ");


    }
}
