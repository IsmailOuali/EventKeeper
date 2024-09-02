package menus;
import services.EventService;
import java.util.Scanner;

public class EventMenu {
    
    public static void display()
    {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n*****Event Menu******\n");
        System.out.println("(1) Add Event\n");
        System.out.println("(2) Modify Event \n");
        System.out.println("(3) Delete Event \n");
        System.out.println("(4) Exit \n");
        System.out.println("**********************\n");
        System.out.println("Your selection is: ");

        choice = sc.nextInt();
        EventService event = new EventService();
        EventMenu menu = new EventMenu();
        switch (choice) {
            case 1:
          
                event.addEvent();
                menu.display();
                break;
            case 2:
        
                event.displayEvents();
                menu.display();
            case 3:
        
                event.displayEvents();
                System.out.println("Select the id of the event that you want to delete");
                int delChoice = sc.nextInt();
                event.deleteEventById(delChoice);
                menu.display();
                break;
            default:
                break;
        }
    }
}
