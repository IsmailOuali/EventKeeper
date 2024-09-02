package menus;

import java.util.Scanner;

public class RoleMenu {
    public static int display() { 
        Scanner sc = new Scanner(System.in);
        System.out.println("╔═════════════════════════╗");
        System.out.println("║       Role Menu         ║");
        System.out.println("╠═════════════════════════╣");
        System.out.println("║ 1. Admin Menu           ║");
        System.out.println("║─────────────────────────║");
        System.out.println("║ 2. Participant Menu     ║");
        System.out.println("╚═════════════════════════╝");
        System.out.println("Your selection is: ");
        
        return sc.nextInt();
    }
}