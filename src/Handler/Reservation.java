package Handler;

import Users.Professor;
import java.time.LocalTime;

public class Reservation {
    private LocalTime beginTime;
    private LocalTime endTime;
    private Place place;
    private Professor professor;
    private String campus;
    
    //Constructor
    public Reservation(LocalTime beginTime, LocalTime endTime, Place place, Professor professor, String campus) {
        
        /*
        *   Aqui la validacion
        *   con Try-catch
        */
        
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.place = place;
        this.professor = professor;
        this.campus = campus;
    }

    public LocalTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
    
    //Aqui el metodo que comprueba si ya existe una reserva en el intervalo del constructor
    //Deberia de estar la ejecucion de esta funcion dentro del constructor
}
