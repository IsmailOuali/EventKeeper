package models;

public class Participant extends User{
    
    public Participant(String name) {
        super(name);

    }


    public String getName(){
        return super.getName();
    }

    public String toString(){
        return String.format("Participant { name = " + getName() + "}");
    } 
}
