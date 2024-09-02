package services;
import models.User;
import java.util.Scanner;

import menus.AdminMenu;
import menus.RoleMenu;

public class UserService {

    private static String pass;
    private static Scanner scan = new Scanner(System.in);


    public static  void checkAdmin()
    {
        System.out.println(" | ******* Enter the admin password ******* |\n");
        System.out.println(" | ---------------------------------------- |\n");
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
