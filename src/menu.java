import java.util.Scanner;


public class menu {
    public static void main(String[] args) {
        
        int selectedChoice;
        do{
            selectedChoice = roleMenu();
            switch (selectedChoice) {
                case 1:
                    menuAdmin();
                    break;
                case 2:
                    participantMenu();
                    break;
                default:
                    break;
            }
        }
        while(selectedChoice > 2);

    }

    public static  int roleMenu()
    {
        
        int selection;

        Scanner sc = new Scanner (System.in);

        System.out.println("\n**********************\n");
        System.out.println("Select Your Role\n");
        System.out.println("(1) Admin\n");
        System.out.println("(2) Participant\n");
        System.out.println("**********************\n");

        System.out.println("Your selection is: ");
        selection = sc.nextInt();

        return selection;
    }

    public static int menuAdmin()
    {
        int choice;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n*****Admin Menu******\n");
        System.out.println("(1) Crud an event\n");
        System.out.println("(2) Crud of Participant \n");
        System.out.println("(3) Show all inscriptions \n");
        System.out.println("**********************\n");
        System.out.println("Your selection is: ");


        choice = sc.nextInt();   
        return choice; 

    }

    public static int participantMenu()
    {
        int choice;

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*****Participant Menu******\n");
        System.out.println("(1) Display eventst\n");
        System.out.println("(2) Subscribed events \n");
        System.out.println("(3) Search events by date \n");
        System.out.println("(4) Search events by location \n");
        System.out.println("**********************\n");
        System.out.println("Your selection is: ");


        choice = sc.nextInt();
        return choice;

    }
}