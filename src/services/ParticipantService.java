package services;
import models.Participant;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class ParticipantService {
    
    public static List<Participant> participants = new ArrayList<>();


    /*  Function that add a participant */
    
    public void addParticipant(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Participant name: \n");
        String name = scan.nextLine();

        Participant participant = new Participant(name);
        participants.add(participant);
        System.out.println("The Participant is added Succesfully: \n"+ participants);
    }
    
    /*  Function that Display all participants */

    public void displayParticipant()
    {
        if(participants.isEmpty())
        {
            System.out.println("No Participants found.");
        }else{
            for(Participant participant: participants)
            {
                System.out.println(participant.getName());
            }
        }
        
    }
    
    /*  Function that Delete a participant by name */

    public void deleteParticipantByName() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the name of Participant to delete: \n");
        String name = s.nextLine();

        
        for (Participant participant : participants) {
            if (participant.getName().equals(name)) {
                participants.remove(participant);
                System.out.println("Participant with name " + name + " deleted successfully.");
                return;
            }
        }
        System.out.println("Participant with name " + name + "not found");
    }

    /*  Function that checks if the participant exist */

    public static boolean getParticipantExist(String name) {
        for (Participant p : participants) {
            if (p.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    /*  Function that return the object of the participant that have the name*/

    public static Participant geParticipantByName(String name)


    {


        for (Participant participant : participants)
        {
            


            if(participant.getName().equals(name))
            {
                return participant;
            }
            
        }
        System.out.println("No participant found with name= "+ name);
        return null;
    }
    
    /*  Function that count the number of participants */

    public static int participantCounter()
    {
        return participants.size();
    }
    
    
    
    /*  Function that get all the participants */
    
    public List<Participant> getParticipants() {
        return participants;
    }   

}
