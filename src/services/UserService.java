package services;
import java.util.Scanner;

import menus.AdminMenu;
import menus.RoleMenu;

public class UserService {

    private static String pass;
    private static Scanner scan = new Scanner(System.in);

    /* Function that check if it's an admin by password*/

    public static  void checkAdmin()
    {
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║             Enter the admin password     ║");
        System.out.println("╚══════════════════════════════════════════╝");
        
        pass = scan.nextLine();

        if("root".equals(pass))
        {
            AdminMenu.display();
        }
        else{
            System.out.println("The password is incorrect");
            RoleMenu.display();
        }
    }


    
}
