public class RegexKullan {
    public static void main(String[] args) {
        String asd="selam nasılsın REgex kullanma denemesi yapıyorum";
        System.out.println(asd.matches(".*dem.*"));
        System.out.println(asd.matches("[^a-z]"));
        System.out.println(asd.matches("[^a]"));
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
