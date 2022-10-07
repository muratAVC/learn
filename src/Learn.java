import java.util.Locale;
import java.util.Scanner;

public class Learn {

    public static String ilkHarfBuyuk(String str)
    {
        // str Stringinin içindeki kelimelerin ilk harfleri büyük diğerleri küçük yapılır.
        char c = Character . toUpperCase ( str . charAt ( 0 ));
        //ilk harfini buyuttuk
        str = c + str . substring ( 1 );
        //buyutulen ilk harften sonra kelimenin diger harflerini ekledik.
        String bosluk=" ";
        for (int i = 1 ; i<str.length();i++)
        {
            if (str.charAt(i)==' ')
            {
                c=Character.toUpperCase(str.charAt (i+1));
                str = str.substring(0,i)+bosluk +c  + str.substring(i+2);

            }

        }

        return str;
    }



    public static void main(String[] args) {
        String str="selam nasılsın murat";
        str=ilkHarfBuyuk(str);
        System.out.println(str);

        Scanner d=new Scanner(System.in);
        String s=d.nextLine();


    }

}
