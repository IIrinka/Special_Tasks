package tasks;

public class Finde_How_Many_JAVA_Words_In_Sentence {

    public static void main(String[] args) {
        String str = "I Love java, java is fun.";
        System.out.println(findeHowManyJAVAWordsInSentence(str));
        System.out.println(OneMorefindeHowManyJAVAWordsInSentence(str));
    }

    public static int findeHowManyJAVAWordsInSentence(String word) {
        int count = 0;
        for (int i = 0; i < word.length() - 3; i++) {
            if (word.substring(i, i + 4).equalsIgnoreCase("java"))
                count++;
        }
        return count;
    }

    // one more solution
    public static int OneMorefindeHowManyJAVAWordsInSentence(String word) {
        int java = 0;
        word = word.toLowerCase();
        while (word.contains("java")) {
            java++;
            word = word.replaceFirst("java", "");
        }
        return java;
    }
}
