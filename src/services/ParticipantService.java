package services;
import models.Participant;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class ParticipantService {
    
    public static List<Participant> participants = new ArrayList<>();


    public void addParticipant(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Participant name: \n");
        String name = scan.nextLine();

        Participant participant = new Participant(name);
        participants.add(participant);
        System.out.println("The Participant is added Succesfully: \n"+ participants);
    }

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

    public static boolean getParticipantExist(String name) {
        for (Participant p : participants) {
            if (p.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

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

    public List<Participant> getParticipants() {
        return participants;
    }   

}
