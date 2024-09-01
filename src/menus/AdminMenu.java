package menus;

import java.util.Scanner;
import menus.EventMenu;

public class AdminMenu {

    public static int display()
    {

            int choice;
    
            Scanner sc = new Scanner(System.in);
            System.out.println("\n*****Admin Menu******\n");
            System.out.println("(1) Crud an event\n");
            System.out.println("(2) Crud of Participant \n");
            System.out.println("(3) Show all inscriptions \n");
            System.out.println("(4) Exit \n");
            System.out.println("**********************\n");
            System.out.println("Your selection is: ");
    
    
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    EventMenu.display();
                    break;
            
                default:
                    break;
            }
            return choice;        
    }
}