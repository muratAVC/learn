import java.util.Scanner;

public class Sonsuz {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,top=0;
        String asd;
        boolean kont=false;


            System.out.println("enter num1");
            a=s.nextInt();
            System.out.println("enter num2");
            b=s.nextInt();s.nextLine();
            do {
                kont=false;
            System.out.println("enter opretor(/,*,+,-)");
            asd=s.nextLine();
            if (asd.equals("/")){
                System.out.println(a/b);
            } else if (asd.equals("*")) {
                System.out.println(a*b);
            } else if (asd.equals("+")) {
                System.out.println(a+b);
            } else if (asd.equals("-")) {
                System.out.println(a-b);
            } else {
                System.out.println("invalid enter. repeat again");
                kont=true;
            }
        }while (kont);



        /*boolean b=true;
        do {
            a=s.nextInt();
            if (a<0){
                b=false;
            } else {
                top+=a;
            }
        }while (b);*/
        System.out.println(top);
    }
}
