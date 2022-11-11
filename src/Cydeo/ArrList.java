package Cydeo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrList {
    public static List<String> mainMenuList = Arrays.asList("HOT COFFEES", "COLD COFFEES", "EXIT");
    static ArrayList<Integer> unexpectedValues = new ArrayList<>();

    private static int select;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int invalidCounter = 0 , timesToReEnter = 3;
        System.out.println("< ----------------------------------- > ");
        do {
            for (int i = 0; i < mainMenuList.size() && (number <= 3); i++) {
                System.out.println("< (" + (number++) + " ) " + mainMenuList.get(i));
            }
            System.out.println("< ----------------------------------- > ");

            System.out.print("WHICH TYPE OF COFFEE WOULD YOU LIKE TO CHOOSE : ");
            select = scanner.nextInt();
            switch (select) {
                case 1, 2 -> System.out.println();
                //case 3 -> exitMenu.displayExit();

                default -> {
                    System.err.println("< INVALID CHOICE : " + select
                    + "\n< YOU HAVE " +  (--timesToReEnter) + " TIMES TO SELECT\n");
                    ++invalidCounter;
                    unexpectedValues.add(select);
                }
            }
        } while ((invalidCounter < 3));
        throw new IllegalStateException("\n< ------------------------ > "
                + "\nYOU HAVE REACHED : " + invalidCounter
                + "\nUNEXPECTED VALUES :  " + unexpectedValues
                + "\n< ------------------------ >");
    }
}
