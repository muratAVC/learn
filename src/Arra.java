import java.util.Scanner;

public class Arra {//HackerRank Çözümü
    static boolean varmi(String[] a,String b){
        boolean var=false;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==b){
                var=true;
            }
        }
        return var;
    }
    static int frekans(String[] a,String b){
        int frek=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(b.charAt(0))){
                frek++;
            }
        }
        return frek;
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toUpperCase();
        b=b.toUpperCase();
        Boolean result=true;



        String[] asda = new String[a.length()];
        for (int i = 0; i < a.length(); i++) {
            if(!varmi(asda, a.substring(i,i+1))){
                asda[i]=a.substring(i,i+1);
            }
        }
        java.util.Arrays.sort(asda);

        for (int i = 0; i < asda.length; i++) {
            asda[i]=asda[i]+""+frekans(asda, asda[i]);
        }

        String[] asdb = new String[b.length()];
        for (int i = 0; i < b.length(); i++) {
            if(!varmi(asdb, b.substring(i,i+1))){
                asdb[i]=b.substring(i,i+1);
            }
        }
        java.util.Arrays.sort(asdb);
        for (int i = 0; i < asdb.length; i++) {
            asdb[i]=asdb[i]+""+frekans(asdb, asdb[i]);
        }

        for (int i = 0; i < asdb.length; i++) {
            if(!asda[i].equals(asdb[i])){
                result=false;
                break;
            }
        }
        if(a.length()!=b.length()){
            result=false;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }
}
//Arrays.sort(str_Array, java.util.Collections.reverseOrder());

