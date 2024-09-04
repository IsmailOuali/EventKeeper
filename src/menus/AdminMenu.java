package menus;

import java.util.Scanner;

import services.EventService;
import services.ParticipantService;

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
            System.out.println("║ 4. Statistics                    ║");
            System.out.println("║──────────────────────────────────║");
            System.out.println("║ 5. Exit                          ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.println("Your selection is: ");
    
    
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    EventMenu.display();
                    break;
                case 2:
                    ParticipantCRUD.display();
                    break;
                
                case 3:
                    ParticipantMenu.displayInscriptions();
                    AdminMenu.display();
                    break;
                case 4:
                    System.out.printf(" Number of participants: { %d }\n" , ParticipantService.participantCounter());
                    System.out.printf(" Number of events: { %d }\n" , EventService.eventCounter());
                    System.out.printf(" Number of inscriptions: { %d }\n" , ParticipantMenu.inscriptionCount());
                    AdminMenu.display();
                    break;

                case 5:
                    RoleMenu.display();
                    break;
                default:
                    break;
            }
            return choice;        
    }
}