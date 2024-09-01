package services;

import models.Event;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventService {

    private List<Event> events = new ArrayList<>();

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

    public void displayEvents() {
        if (events.isEmpty()) {
            System.out.println("No events available.");
        } else {
            for (Event event : events) {
                System.out.println(event.toString());
            }
        }
    }

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

    
    public List<Event> getEvents() {
        return events;
    }
}
