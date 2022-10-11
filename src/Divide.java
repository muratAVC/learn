import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        System.out.print("Divisible By15 ");
        for (int j = 0; j <= i; j++) {
            if (j%15==0) {
                System.out.print(j+" ");
            }
        }
        System.out.println();
        System.out.print("Divisible By5 ");
        for (int j = 0; j <= i; j++) {
            if (j%5==0){
                if(j%15!=0){
                    System.out.print(j+" ");
                }
            }
        }
        System.out.println();
        System.out.print("Divisible By3 ");
        for (int j = 0; j <= i; j++) {
            if (j%3==0) {
                if (j%5!=0 || j%15!=0){
                    System.out.print(j+" ");
                }
            }
        }
    }
}
