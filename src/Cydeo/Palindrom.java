package Cydeo;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine(),wordT="";
        s.close();
        for (int i = word.length()-1; i >=0 ; i--) {
            wordT=wordT+word.substring(i,i+1);
        }
        System.out.println(word.equals(wordT));


    }
}
