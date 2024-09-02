import menus.*;
import services.*;
 
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        
        int selectedChoice;
        int nextChoice;
        do {
            
            selectedChoice = RoleMenu.display(); 
            
            switch (selectedChoice) {
                case 1:
                    System.out.flush();  
                    UserService.checkAdmin();
                    break;
                case 2:
                    System.out.flush();  
                    nextChoice = ParticipantMenu.display();
                    break;
                default:
                    System.out.println("Invalid choice number");
                    break;
            }
        } while(selectedChoice > 2);

    }




}
