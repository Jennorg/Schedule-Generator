package Handler;

import Users.Professor;
import java.time.LocalTime;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Reservation implements Serializable{
    private LocalTime beginTime;
    private LocalTime endTime;
    private Place place;
    private Professor professor;
    private String campus;
    
    //Constructor
    public Reservation(LocalTime beginTime, LocalTime endTime, Place place, Professor professor, String campus) {
        
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
    
    public boolean isValidTime(LocalTime begin, LocalTime end) {
        /*llamas a esta funcion en la creacion del horario para comprobar si el tiempo asignado a
        la reservacion recien creado coincide con los tiempos de la reserva con un foreach para
        recorrer todo el array*/
        
        if(begin == beginTime) return false;
        if(begin.isBefore(endTime) && begin.isAfter(beginTime)) return false;        
                
        return true;
    }
    
    
   

}
