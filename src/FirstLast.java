import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word1,word2;
        word1= scanner.nextLine();
        word2= scanner.nextLine();
        scanner.close();
        if (word1.charAt(word1.length()-1)==word2.charAt(0)){
            System.out.println(word1+word2.substring(1));
        } else {
            System.out.println(word1+word2);
        }
    }
}
