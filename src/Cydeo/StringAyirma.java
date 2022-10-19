package Cydeo;

import java.util.Scanner;

public class StringAyirma {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String s = scan.nextLine();
                // Write your code here.

                scan.close();
                String[] asd = s.split("[^a-zA-Z]");
                //tüm harfleri içine alarak bölüyor


                int numTokens = 0;


                for (int i=0; i<asd.length; ++i)
                    if (asd[i].length() > 0)
                        numTokens++;

                System.out.println(numTokens);

                for (int i=0; i<asd.length;++i)
                    if (asd[i].length() > 0)
                        System.out.println(asd[i]);


            }
        }


