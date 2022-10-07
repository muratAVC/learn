import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String email,firstName,lastName,domain;
        email= scanner.nextLine();
        scanner.close();
        int ind1=0,ind2=0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='_'){
                ind1=i;
            }
            if (email.charAt(i)=='@'){
                ind2=i;
            }
        }
        firstName=email.substring(0,ind1);
        lastName=email.substring(ind1+1,ind2);
        domain=email.substring(ind2+1);
        String a=firstName.substring(0,1);
        a=a.toUpperCase();
        firstName=a+firstName.substring(1);
        a=lastName.substring(0,1);
        a=a.toUpperCase();
        lastName=a+lastName.substring(1);
        System.out.println(firstName+"\n"+lastName+"\n"+domain);
    }
}
