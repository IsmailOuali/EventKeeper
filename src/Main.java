import menus.*; 
 
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        
        int selectedChoice;
        int nextChoice;
        do {
            
            selectedChoice = RoleMenu.display(); 
            
            switch (selectedChoice) {
                case 1:
                    nextChoice = AdminMenu.display();
                    break;
                case 2:
                    nextChoice = ParticipantMenu.display();
                    break;
                default:
                    System.out.println("Invalid choice number");
                    break;
            }
        } while(selectedChoice > 2);

    }




}
