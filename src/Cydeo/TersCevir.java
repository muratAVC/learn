package Cydeo;

import java.util.Scanner;


public class TersCevir {


    public static String revWords(String str) {
        StringBuilder reversedWords = new StringBuilder();

        // split input string by " " space to get each word as String[]
        String[] words = str.split(" ");

        // loop over the array from back
        for(int i = words.length - 1; i >= 0; i--) {
            // add words to reversedWords with space
            reversedWords.append(words[i] + " ");
        }

        // trim needed to remove last space in the end
        return reversedWords.toString().trim();
    }
    public static String[] terscevir(String[] str){
        String[] asd=new String[str.length];
        int count= 0;
        for (int i = str.length-1; i >= 0; i--) {
            asd[count]=str[i];
            count++;
        }
        return asd;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine(),wordT="";
        s.close();
        for (int i = word.length()-1; i >=0 ; i--) {
            wordT=wordT+String.valueOf(word.charAt(i));
            //wordT=wordT+word.substring(i,i+1);
        }
        System.out.println(wordT);
        String[] d={"m","u", "r","a","t"};
        d=terscevir(d);
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]);
        }
        System.out.println("");

        System.out.println(revWords(word));





    }
}
