package menus;

import java.util.Scanner;

import models.Event;
import models.Inscription;
import models.Participant;
import services.EventService;
import services.ParticipantService;
import java.util.ArrayList;
import java.util.List;

public class ParticipantMenu {
    

    private static List<Inscription> inscriptions = new ArrayList<>();    

    public static void display()
    {
    
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║           Participant Menu           ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ 1. Display events                    ║");
        System.out.println("║──────────────────────────────────────║");
        System.out.println("║ 2. Subscribe in an event             ║");
        System.out.println("║──────────────────────────────────────║");
        System.out.println("║ 3. Show  all my Subscrbtions         ║");
        System.out.println("║──────────────────────────────────────║");
        System.out.println("║ 4. Search events by location         ║");
        System.out.println("║──────────────────────────────────────║");
        System.out.println("║ 5. Exit                              ║");
        System.out.println("╚══════════════════════════════════════╝");
        
        System.out.println("Your selection is: ");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                EventService.displayEvents();
                ParticipantMenu.display();
                break;
                case 2:
                ParticipantMenu.inscripeEvent();
                ParticipantMenu.display();
                
                case 3:
                ParticipantMenu.displayParticipantIns(getParticipantName());
                ParticipantMenu.display();
            case 5:
                RoleMenu.display();
            default:
                break;
        }

        
    }

    public static String getParticipantName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your Unique Name: \n");

        String participantName = scan.nextLine();
        if (ParticipantService.getParticipantExist(participantName)) {
            return participantName;
        }
        else
        {
            return null;
        }
    }
    

    public static void participantName()
    {
        Scanner sca = new Scanner(System.in);
        System.out.println("Please Enter your Unique Name: \n");

        String participantName = sca.nextLine();
        if (ParticipantService.getParticipantExist(participantName)) {
            ParticipantMenu.display();;
        }
        else
        {
            System.out.println("The name u gived is not a Participant.");
            ParticipantMenu.display();
        }
        


    }

    public static void inscripeEvent()
    {
        Scanner sc = new Scanner(System.in);

        EventService.displayEvents();

        System.out.println("Enter the id of the event that you want to inscripe: \n");
        int eventId = sc.nextInt();

        Event event = EventService.getEventById(eventId);
        Participant participant = ParticipantService.geParticipantByName(getParticipantName());

        if (event != null) {
            Inscription inscription = new Inscription(participant, event);
            inscriptions.add(inscription);
    
            System.out.println("Inscription added succesfully: "+ inscription);
        }else
        {
            System.out.println("ID of the event not found.");
        }


       
    }

    public static void displayInscriptions()
    {
        if (inscriptions.isEmpty()) {
            System.out.println("No Inscriptions found");
        }else{
            for(Inscription inscription : inscriptions)
            {
                System.out.println(inscription.toString());
            }
        }
    }

    public static void displayParticipantIns(String name)
    {
         boolean bool = false;
        if (!inscriptions.isEmpty()) {
            for (Inscription inscription : inscriptions)
            {  
               if(inscription.getParticipant().equals(name))
               {
                   System.out.println(inscription.toString());
                   bool = true;
               }
            }
            if (bool == false)
            {
               System.out.println("No Inscriptions found.");
            }
            
        }else
        {
            ParticipantMenu.display();

        }
        
    }

    public static void deleteInscription(int id)
    {
        for (Inscription inscription : inscriptions) {
            if(inscription.getId() == id)
            {
                inscriptions.remove(inscription);
                System.out.println("Your inscription is deleted Succesfully\n");
                return;
            }
            else{
                System.out.println("No Inscriptions found with this id\n");
            }
        }
    }
}
