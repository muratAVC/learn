import java.util.Scanner;

public class Banana {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word1,word2;
        word1= scanner.nextLine();
        word2= scanner.nextLine();
        System.out.println(word1.substring(1)+word2.substring(1));

    }
}
