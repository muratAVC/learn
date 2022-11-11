import java.util.Arrays;
import java.util.Scanner;

public class Zombiler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int[] zzz = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int zzz[]={3, 6, 0, 4, 3, 2, 7, 0};
        //TODO. Write you code below this line.
        boolean control=true;
        int index=0;


        do{
            int arr[]=zzz;
            System.out.println("Day "+index+" "+ Arrays.toString(arr));
            index++;
            for (int i = 0; i < zzz.length; i++) {
                if(zzz[i]==0){
                    if (i==0) {
                        arr[i+1]=zzz[i+1]/2;
                    } else if(i==zzz.length-1){
                        arr[i-1]=zzz[i-1]/2;
                    } else if(i>0 && i<zzz.length-1){
                        arr[i+1]=zzz[i+1]/2;
                        arr[i-1]=zzz[i-1]/2;

                    }
                }
                zzz=arr;
            }


            int count=0;
            for (int i = 0; i < arr.length; i++) {
                count+=arr[i];
            }
            if(count==0) {
                control=false;
                System.out.println("Day "+index+" "+Arrays.toString(arr));
                System.out.println("---- EXTINCT ----");
            }
        }while(control);
    }
}
