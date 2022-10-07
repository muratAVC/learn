import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Dene {
    public static void main(String[] args) {
        int x=10;
        int y=x++;
        System.out.println(y+" "+(++x)+" "+ (x++));
        System.out.println(y+" "+x+" "+ (++x));
        String A="selam";
        char c;
        c=A.charAt(2);
        java.util.Scanner scanner =new java.util.Scanner(System.in);
        int fg=scanner.nextInt();
        System.out.println(fg);

        List<String> list= new ArrayList<>();
        list.add("selam");
        list.add("murat");
        list.add("nasılsın");
        List<String> as=new ArrayList<>();
        as.add("esra");
        as.add("sema");

        System.out.println(list);
        list.add(2,"bugun");
        System.out.println(list);

        Object Collection = new Object();

       // list.addAll(Collection<String> as);
    }
}
