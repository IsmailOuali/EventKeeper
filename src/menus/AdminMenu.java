package menus;

import java.util.Scanner;

public class AdminMenu {

    public static int display()
    {

            int choice;
    
            Scanner sc = new Scanner(System.in);
            System.out.println("╔══════════════════════════════════╗");
            System.out.println("║          Admin Menu              ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.println("║ 1. Crud an event                 ║");
            System.out.println("║──────────────────────────────────║");
            System.out.println("║ 2. Crud of Participant           ║");
            System.out.println("║──────────────────────────────────║");
            System.out.println("║ 3. Show all inscriptions         ║");
            System.out.println("║──────────────────────────────────║");
            System.out.println("║ 4. Exit                          ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.println("Your selection is: ");
    
    
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    EventMenu.display();
                    break;
                case 2:
                    ParticipantCRUD.display();
                case 4:
                    RoleMenu.display();
            
                default:
                    break;
            }
            return choice;        
    }
}