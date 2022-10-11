import java.util.Scanner;

public class CarInsurance {
    public static void main(String[] args) {
        System.out.println("Welcome to the Cydeo car insurance!");
        Scanner scan=new Scanner(System.in);
        double prim=0;

        System.out.println("Enter your full name");//2
        String fullName=scan.nextLine();

        System.out.println("Do you have a US driver license?");//3
        if(scan.nextLine().equals("no")) {
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");//4
        long zipCode=scan.nextLong();
        if (zipCode==20910 || zipCode==20740){
            prim+=60;
        }else if (zipCode==22102 || zipCode==22103){
            prim+=30;
        }else {
            prim+=50;
        }
        scan.nextLine();

        System.out.println("Is this vehicle owned, financed, or leased?");
        String have=scan.nextLine();//5
        if (have.equals("owned")) {
            prim+=10;
        }else if(have.equals("financed")){
            prim+=15;
        } else if(have.equals("leased")){
            prim+=20;
        }


        System.out.println("How is this vehicle primarily used?");//6
        String have1=scan.nextLine();
        if (have1.equals("busines")) {
            prim+=50;
        } else if (have1.equals("pleasure")) {
            prim+=10;
        } else if (have1.equals("commuting")) {
            prim+=20;
            System.out.println("`How many days do you commute?");//6,5
            int dayCommute=scan.nextInt();
            prim+=dayCommute*5;
        }


        System.out.println("How old are you?");//7
        int old=scan.nextInt();
        if (old<16){
            System.out.println("You can't be driving");
            System.exit(0);
        }else if(old>=16 && old<20){
            prim=prim*10;
        } else if (old>=20 && old<25) {
            prim=prim*6;
        } else if (old>=25) {
            prim=prim*2;
        }
        scan.nextLine();

        System.out.println("Have you had any accidents in the last 5 years?");//8
        String accident=scan.nextLine();
        if (accident.equals("Yes") || accident.equals("YES")) {
            System.out.println("How many?");
            int acci=scan.nextInt();
            prim=prim+acci*10;
        }

        System.out.println("What is the highest level of education you have completed?");
        String edu=scan.nextLine();
        if (edu.equals("Bachelors") || edu.equals("Masters")){
            prim=prim-(prim*0.05);
        } else if (edu.equals("PHD")) {
            prim=prim-(prim*0.1);
        }else if (edu.equals("High School")) {
            prim=prim+(prim*0.05);
        }

        String firsName,lastName,a;
        firsName=fullName.substring(0,fullName.indexOf(" "));
        a=firsName.substring(0,1);
        a=a.toUpperCase();
        firsName=a+firsName.substring(1);
        lastName=fullName.substring(fullName.indexOf(" ")+1);
        a=lastName.substring(0,1);
        a=a.toUpperCase();
        lastName=a+lastName.substring(1);
        System.out.println(firsName+" "+lastName+" here's your quote!");
        System.out.println("This is your start premium cost: $"+ prim);

        String refNo=firsName.substring(0,2)+old+lastName.substring(lastName.length()-3)+zipCode+edu;
        System.out.println("This is your reference number: "+refNo);

    }
}
