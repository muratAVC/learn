import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter full name. place");
        String fullName=scan.nextLine();
        String gender,married,insurageType,accident,antitreft;
        int age,mil;
        double price;
        while (true){
            System.out.println("Enter Gender(Male/Female)");
            gender=scan.nextLine();
            if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")){
                break;
            }else {
                System.out.println("invalid enter. try again Place");
            }
        }
        while (true){
            System.out.println("Are you married (yes/no)");
            married=scan.nextLine();
            if (married.equalsIgnoreCase("yes") || married.equalsIgnoreCase("no")){
                break;
            }else {
                System.out.println("invalid enter. try again Place");
            }
        }
        while (true){
            System.out.println("what are you age.");
            age=scan.nextInt();
            if (age>0 || age<120){
                break;
            }else {
                System.out.println("invalid enter. try again Place");
            }
        }
        while (true){
            System.out.println("how many miles do you go in a day");
            mil=scan.nextInt();
            if (mil>5){
                break;
            }else {
                System.out.println("invalid enter. try again Place");
            }
        }
        scan.nextLine();
        while (true){
            System.out.println("how to get insurance (full coverage / liability insurance)");
            insurageType=scan.nextLine();
            if (insurageType.equalsIgnoreCase("full coverage") || insurageType.equalsIgnoreCase("liability insurance")){
                break;
            }else {
                System.out.println("invalid enter. try again Place");
            }
        }
        while (true){
            System.out.println("Have you had an accident in the last 5 years? (yes/no)");
            accident=scan.nextLine();
            if (accident.equalsIgnoreCase("yes") || accident.equalsIgnoreCase("no")){
                break;
            }else {
                System.out.println("invalid enter. try again Place");
            }
        }
        while (true){
            System.out.println("Do you have an anti-theft device? (yes/no)");
            antitreft=scan.nextLine();
            if (antitreft.equalsIgnoreCase("yes") || antitreft.equalsIgnoreCase("no")){
                break;
            }else {
                System.out.println("invalid enter. try again Place");
            }
        }
        if(insurageType.equalsIgnoreCase("full coverage")){
            if (age<25){
                price=90.0;
            }else {
                price=50.0;
            }
            if (mil<=10 ){
                price+=10;
            } else if (mil>10 && mil<=50) {
                price+=30;
            } else {
                price+=50;
            }

        }else {
            if (age<25){
                price=160.0;
            }else {
                price=120.0;
            }
            if (mil<=10 ){
                price+=20;
            } else if (mil>10 && mil<=50) {
                price+=40;
            } else {
                price+=70;
            }
        }
        if (antitreft.equalsIgnoreCase("yes")){
            price=price-(price*0.05);
        }
        if (accident.equalsIgnoreCase("yes")){
            price=price+(price*0.15);
        } else {
            price=price-(price*0.1);
        }
        if (married.equalsIgnoreCase("yes")){
            price=price-(price*0.05);
        }
        System.out.println("total price"+price);
    }
}
