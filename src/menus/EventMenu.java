package menus;
import services.EventService;
import java.util.Scanner;

public class EventMenu {
    
    public static void display()
    {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("╔════════════════════════════════╗");
        System.out.println("║          Event Menu            ║");
        System.out.println("╠════════════════════════════════╣");
        System.out.println("║ 1. Add Event                   ║");
        System.out.println("║────────────────────────────────║");
        System.out.println("║ 2. Modify Event                ║");
        System.out.println("║────────────────────────────────║");
        System.out.println("║ 3. Delete Event                ║");
        System.out.println("║────────────────────────────────║");
        System.out.println("║ 4. Display all events          ║");
        System.out.println("║────────────────────────────────║");
        System.out.println("║ 5. Exit                        ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.println("Your selection is: ");

        choice = sc.nextInt();
        EventService event = new EventService();
        EventMenu menu = new EventMenu();
        AdminMenu adMenu = new AdminMenu();
        switch (choice) {
            case 1:
          
                event.addEvent();
                menu.display();
                break;
            case 2:
        
                event.displayEvents();
                System.out.println("Select the id of the event that you want to update");
                int upChoice = sc.nextInt();
                event.updateEvent(upChoice);
                menu.display();
            case 3:
        
                event.displayEvents();
                System.out.println("Select the id of the event that you want to delete");
                int delChoice = sc.nextInt();
                event.deleteEventById(delChoice);
                menu.display();
                break;
            case 4:
                event.displayEvents();
                menu.display();
            case 5:
                adMenu.display();
            default:

                break;
        }
    }
}
