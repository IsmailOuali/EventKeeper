package menus;
import java.util.Scanner;
import services.ParticipantService;

public class ParticipantCRUD {

    public static int display()
    {
        
        int choice;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║      CRUD Participant Menu       ║");
        System.out.println("╠══════════════════════════════════╣");
        System.out.println("║ 1. Add an Participant            ║");
        System.out.println("║──────────────────────────────────║");
        System.out.println("║ 2. Delete Participant            ║");
        System.out.println("║──────────────────────────────────║");
        System.out.println("║ 3. Show all Participant          ║");
        System.out.println("║──────────────────────────────────║");
        System.out.println("║ 4. Exit                          ║");
        System.out.println("╚══════════════════════════════════╝");
        System.out.println("Your selection is: ");

        choice = sc.nextInt();
        ParticipantService participant = new ParticipantService();

        switch(choice)
        {
            case 1:
                participant.addParticipant();
                ParticipantCRUD.display();
                break;
            case 2:
                participant.deleteParticipantByName();
                ParticipantCRUD.display();

                break;
            case 3:
                participant.displayParticipant();
                ParticipantCRUD.display();
                break;
            case 4:
                AdminMenu.display();
                break;
        }

        switch (choice) {
            case 1:
                
                break;
        
            default:
                break;
        }

        return choice;
    }
    
}
