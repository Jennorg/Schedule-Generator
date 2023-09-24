package Handler;

import java.util.ArrayList;

public class Schedule {
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
}
