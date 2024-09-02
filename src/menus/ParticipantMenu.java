package menus;

import java.util.Scanner;

public class ParticipantMenu {
    
    public static int display()
    {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║           Participant Menu           ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ 1. Display events                    ║");
        System.out.println("║──────────────────────────────────────║");
        System.out.println("║ 2. Subscribed events                 ║");
        System.out.println("║──────────────────────────────────────║");
        System.out.println("║ 3. Search events by date             ║");
        System.out.println("║──────────────────────────────────────║");
        System.out.println("║ 4. Search events by location         ║");
        System.out.println("║──────────────────────────────────────║");
        System.out.println("║ 5. Exit                              ║");
        System.out.println("╚══════════════════════════════════════╝");
        
        System.out.println("Your selection is: ");

        choice = sc.nextInt();

        return choice;
    }
}
