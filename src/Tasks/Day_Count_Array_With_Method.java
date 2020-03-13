package Tasks;

public class Day_Count_Array_With_Method {

        public static void main(String[] args){



            System.out.println(dai(3));
            System.out.println(dai(6));
            System.out.println(dai(9));

            String str = "asdf4kjk5kj3j233jkl";
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
        public static String dai(int num){
            String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
            if (num > 7 || num < 0) {
                return "Fun Day";
            }
            else{
                return week[num-1];
            }
        }}


