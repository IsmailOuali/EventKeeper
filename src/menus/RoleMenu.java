package menus;

import java.util.Scanner;

public class RoleMenu {
    public static int display() { 
        Scanner sc = new Scanner(System.in);
        System.out.println("\n*****Role Menu******\n");
        System.out.println("(1) Admin Menu\n");
        System.out.println("(2) Participant Menu\n");
        System.out.println("**********************\n");
        System.out.println("Your selection is: ");
        
        return sc.nextInt();
    }
}