package menus;

import java.util.Scanner;
import services.EventService;

public class ParticipantMenu {
    
    public static void display()
    {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║           Participant Menu           ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ 1. Display events                    ║");
        System.out.println("║──────────────────────────────────────║");
        System.out.println("║ 2. Subscribe in an event             ║");
        System.out.println("║──────────────────────────────────────║");
        System.out.println("║ 3. Show  all my Subscrbtions         ║");
        System.out.println("║──────────────────────────────────────║");
        System.out.println("║ 4. Search events by location         ║");
        System.out.println("║──────────────────────────────────────║");
        System.out.println("║ 5. Exit                              ║");
        System.out.println("╚══════════════════════════════════════╝");
        
        System.out.println("Your selection is: ");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                EventService.displayEvents();
                break;
            case 5:
                AdminMenu.display();
            default:
                break;
        }

        
    }
}
