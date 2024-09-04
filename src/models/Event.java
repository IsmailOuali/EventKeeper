package models;


public class Event {
    private static int idCounter = 1;

    private  int id;
    private String title;
    private String location;
    private String date;
    


    public Event(String title, String location, String date)
    {
        this.id = ++idCounter;
        this.title = title;
        this.location = location;
        this.date = date;
    }


    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }
    
    public String getLocation()
    {
        return location;
    }

    public void setId(int id){
        this.id = id++;
    }

    public String getDate()
    {
        return date;
    }


    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String toString() {
        return "Event{" + "id = " + id  +
                ", title = " + title + 
                ", location = " + location +
                ", date = " + date + 
                '}';
    }

}
