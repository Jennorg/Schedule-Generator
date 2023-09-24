package Handler;

import java.util.ArrayList;
import java.io.*;
import java.util.HashMap;

public class Schedule implements Serializable{
    private ArrayList<Reservation> reservation;
    
    //Constructor
    public Schedule(ArrayList<Reservation> reservation) {
        this.reservation = reservation;
    }
    
    public Schedule(){
        reservation = new ArrayList<>();
        
    }
    
    

    public ArrayList<Reservation> getReservations() {
        return reservation;
    }

    public void setReservations(ArrayList<Reservation> reservation) {
        this.reservation = reservation;
    }
    
    public void addReservation(Reservation reservation) {
        this.reservation.add(reservation);
    }
    
    /*
    public void serialize(String filename) throws IOException{
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("GuardadoReservas"))){
            out.writeObject(this);
        }
    }
    
    public static Schedule deserialize(String GuardadoReservas) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("GuardadoReservas"))) {
            return (Schedule) in.readObject();
        }
    }
*/
    
    
    
}
