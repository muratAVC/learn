import java.util.Locale;
import java.util.Scanner;

public class UPER {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word1 = s.nextLine();
        String word2 = s.nextLine();
        //System.out.println(word1.equals(word2));

boolean f;
        //System.out.println(word1);
        //System.out.println(word2);
        f=word1.contains(word2);
        System.out.println(f);

        /*
        System.out.println("word: "+ word);
        System.out.println("uppercase: " + word.toUpperCase());
        System.out.println("lowercase: " + word.toLowerCase());
        word=word.replaceAll("dumb","cool");
        System.out.print("Starts with a: ");
        System.out.println(word.charAt(0)=='a');
        System.out.print("Starts with e: ");
        System.out.println(word.charAt(word.length()-1)=='e');*/
    }
}
