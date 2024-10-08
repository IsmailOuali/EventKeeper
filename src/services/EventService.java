package services;

import models.Event;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventService {


    public static List<Event> events = new ArrayList<>();

    
    /* Function that adds an event */
    
    public void addEvent() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the title of the event: \n");
        String title = scan.nextLine();
        System.out.println("Enter the location of the event: \n");
        String location = scan.nextLine();
        System.out.println("Enter the date of the event: \n");
        String date = scan.nextLine();

        Event event = new Event(title, location, date);
        events.add(event);

        System.out.println("Event added successfully: " + event);
    }
    

    /* Function that updates an event */
    
    public void updateEvent(int id)
    {
        Scanner scanUpdate = new Scanner(System.in);
        
        System.out.println("Enter the new title of the event: \n");
        String newTitle = scanUpdate.nextLine();
        System.out.println("Enter the new location of the event: \n");
        String newLocation = scanUpdate.nextLine();
        System.out.println("Enter the new date of the event: \n");
        String newDate = scanUpdate.nextLine();
        
        for (Event eventUpdate : events)
        {
            eventUpdate.setTitle(newTitle);
            eventUpdate.setLocation(newLocation);
            eventUpdate.setDate(newDate);
        }

        System.out.println("Event updated successfully: " + events.toString());
    }

    
    /* Function that diplays events */

    public static void displayEvents() {
        if (events.isEmpty()) {
            System.out. println("No events available.");
        } else {
            for (Event event : events) {
                System.out.println(event.toString());
            }
        }
    }

    /* Function that delete events */

    public void deleteEventById(int id) {
        for (Event event : events) {
            if (event.getId() == id) {
                events.remove(event);
                System.out.println("Event with ID " + id + " deleted successfully.");
                return;
            }
        }
        System.out.println("Event with ID " + id + "not found");
    }

    
    /* Functon that get the event by id */

    public static Event getEventById(int id) {

        for (Event event : events) {
            if (event.getId() == id) {
                return event;
            }
        }
        System.out.println("No event found with id= "+ id);
        return null;
    }
    
    /* Function that Searches the event by location */

    public static Event searchEventByLocation(String searchInput)
    {
        for(Event event : events)
        {
            if(event.getLocation().contains(searchInput))
            {
                return event;
            }
        }
        return null;
        
    }
    
    /* Function that counts of the events */
    
    public static int eventCounter()
    {
        return events.size();
    }

    
    public List<Event> getEvents() {
        return events;
    }
}
