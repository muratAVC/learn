import java.util.Scanner;

public class RegexKullan {
    public static void main(String[] args) {
        String asd="selam nasılsın REgex kullanma denemesi yapıyorum";
        System.out.println(asd.matches(".*dem.*"));
        System.out.println(asd.matches("[^a-z]"));
        System.out.println(asd.matches("[^a]"));



                //DO NOT TOUCH FOLLOWING LINE/LINES
                Scanner scan = new Scanner(System.in);
                String word = scan.next();
                int midle=0;
                //WRITE YOUR CODE BELOW
                if(word.length()%2==0){//if the word length is even
                    midle=word.length()%2;
                    System.out.println(word.charAt(midle-1)+word.charAt(midle));
                }else{// if the word length is odd
                    midle=word.length()%2;
                    System.out.println(word.charAt(midle+1));
                }


        //hacherrank çözümü
        /*
        Pattern Syntax Checker
        import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
              try{
              Pattern.compile(pattern);
              System.out.println("Valid");
              } catch (PatternSyntaxException e){
                  System.out.println("Invalid");
              }

              testCases--;
		}
	}
}
         */
    }
}
