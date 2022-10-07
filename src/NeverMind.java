import java.util.Scanner;

public class NeverMind {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        scan.close();
        if (s.substring(s.length()-2,s.length()).equals("ly")){
            System.out.println("really!!!");
        } else {
            System.out.println(" Never Mind");
        }
    }
}
