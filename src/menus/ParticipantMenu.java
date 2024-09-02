package menus;

import java.util.Scanner;

public class ParticipantMenu {
    
    public static int display()
    {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n|******* Participant Menu ********|\n");
        System.out.println("  | (1) Display events              |\n");
        System.out.println("  | ------------------------------- |\n");
        System.out.println("  | (2) Subscribed events           |\n");
        System.out.println("  | ------------------------------- |\n");
        System.out.println("  | (3) Search events by date       |\n");
        System.out.println("  | ------------------------------- |\n");
        System.out.println("  | (4) Search events by location   |\n");
        System.out.println("  | ------------------------------- |\n");
        System.out.println("  | (5) Exit                        |\n");
        System.out.println(" ____________________________________\n");
        System.out.println("Your selection is: ");

        choice = sc.nextInt();
        return choice;
    }
}
