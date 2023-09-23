package Handler;

public class Schedule {
    private Reservation reservation[];
    
    //Constructor
    public Schedule(Reservation[] reservation) {
        this.reservation = reservation;
    }

    public Reservation[] getReservation() {
        return reservation;
    }

    public void setReservation(Reservation[] reservation) {
        this.reservation = reservation;
    }
    
    //Aqui los metodos para mostrar el horario
}
