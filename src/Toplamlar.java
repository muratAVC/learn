import java.util.Scanner;



public class Toplamlar {
    public static void fact(int fac){
        int num=1;

        for (int i = 1; i <= fac ; i++) {
            num*=i;
        }
        System.out.println(num);


        fac=num;
       // return fac;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int sumEven=0,sumOdd=0,sum=0;

        for (int i = 0; i < num; i++) {
            if (i%2==0){ sumEven+=i;
            }
            if (i%2==1){
                sumOdd+=i;
            }
            sum+=i;
        }

        System.out.println("1 to 100 sum even: "+sumEven);
        System.out.println("1 to 100 sum Odd: "+sumOdd);
        System.out.println("1 to 100 sum: "+sum);

        fact(num);
    }
}


