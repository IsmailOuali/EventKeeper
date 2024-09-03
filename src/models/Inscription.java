package models;

public class Inscription {
    
    private static int idCounter = 1;
    private int id;
    private Participant participant;
    private Event event;

    public Inscription(Participant participant, Event event)
    {
        this.id = idCounter++;
        this.participant = participant;
        this.event = event;
    }

    public int getId()
    {
        return id;
    }

    public String getParticipant()
    {
        return participant.getName();
    }

    public String getEvent()
    {
        return event.getTitle();
    }

    public void setId(int id)
    {
        this.id = id++;
    }

    public String toString()
    {
        return "Inscription{ id= "+ id + "Event= "+ event.getTitle() + '\'' + "Participant= " + participant.getName() + '}';
    }
}
