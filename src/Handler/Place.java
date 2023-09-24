package Handler;

import Users.Person;

public class Place {
    private String name;
    private boolean avaiable;
    private int number;

    public Place(String name, boolean avaiable, int number) {
        this.name = name;
        this.avaiable = avaiable;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    @Override
    public String toString(){               
        return (this.name + " " + this.number);
    }
    
}
