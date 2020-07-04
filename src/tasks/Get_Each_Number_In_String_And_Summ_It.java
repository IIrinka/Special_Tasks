package tasks;

public class Get_Each_Number_In_String_And_Summ_It {

        public static void main(String[] args) {

            String str = "AA3DDGH22J1H6GF4";
            String numsSequence ="";
            int sum=0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    numsSequence+=str.charAt(i);
                    int num = Integer.valueOf(""+str.charAt(i));
                    sum+=num;
                } }
            System.out.println(numsSequence);      //   322164
            System.out.println(sum);               //   18

        }
    }
