package Handler;

import Users.Person;

public class Place {
    private String name;
    private boolean avaiable;
    private Person inCharge;
    private int number;

    public Place(String name, boolean avaiable, Person inCharge, int number) {
        this.name = name;
        this.avaiable = avaiable;
        this.inCharge = inCharge;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvaiable() {
        return avaiable;
    }

    public void setAvaiable(boolean avaiable) {
        this.avaiable = avaiable;
    }

    public Person getInCharge() {
        return inCharge;
    }

    public void setInCharge(Person inCharge) {
        this.inCharge = inCharge;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
}
