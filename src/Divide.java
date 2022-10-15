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
    /*
    Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        String div15 = "";
        String  div5= "";
        String div3= "";

        for (int i =1; i <=num ; i++) {
            if (i%15==0) {
                div15+=i +" ";
            } else if (i%5==0) {
                div5+= i+ " ";
            } else if   (i%3==0) {
                div3+= i+ " ";
            }
        }
        System.out.println("div3 = " + div3);
        System.out.println("div5 = " + div5);
        System.out.println("div15 = " + div15);

*/
    }

}
