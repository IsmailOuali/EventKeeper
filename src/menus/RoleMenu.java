package menus;

import java.util.Scanner;
import services.*;

import services.UserService;

public class RoleMenu {
    public static void display() { 
        Scanner sc = new Scanner(System.in);
        System.out.println("╔═════════════════════════╗");
        System.out.println("║       Role Menu         ║");
        System.out.println("╠═════════════════════════╣");
        System.out.println("║ 1. Admin Menu           ║");
        System.out.println("║─────────────────────────║");
        System.out.println("║ 2. Participant Menu     ║");
        System.out.println("╚═════════════════════════╝");
        System.out.println("Your selection is: ");

        int selectedChoice = sc.nextInt();


        do {
                        
            switch (selectedChoice) {
                case 1:
                      
                    UserService.checkAdmin();
                    break;
                case 2:
                      
                     ParticipantMenu.display();
                    break;
                default:
                    System.out.println("Invalid choice number");
                    break;
            }
        } while(selectedChoice > 2);
        
    }
}