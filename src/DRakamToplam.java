import java.util.Scanner;

public class DRakamToplam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String arr= scan.nextLine();
        int digits=0, a;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.codePointAt(i) > 47 && arr.codePointAt(i) < 58) {
                a=Integer.valueOf(arr.substring(i, i + 1));
                digits = digits + a;
            }
        }
        System.out.println(digits);
    }
}
