import java.util.Scanner;

public class OzelKarakter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String arr=scan.nextLine();
        String letters="",specialC="",digits="";
        String a;
        for (int i = 0; i < arr.length(); i++) {

            if (arr.codePointAt(i) > 96 && arr.codePointAt(i) < 123) {
                a = arr.substring(i, i + 1);
               // System.out.print(a);
                letters=letters+a;
                //System.out.println(a);
            }else if (arr.codePointAt(i) > 64 && arr.codePointAt(i) < 91) {
                a = arr.substring(i, i + 1);
                letters=letters+a;
            }else if (arr.codePointAt(i) > 47 && arr.codePointAt(i) < 58) {
                a = arr.substring(i, i + 1);
                digits=digits+a;
            } else {
                a = arr.substring(i, i + 1);
                specialC=specialC+a;
            }
            }
            System.out.println("Letters : " + letters);
            System.out.println("digits : " + digits);
            System.out.println("special Chars : " + specialC);

    }
}
