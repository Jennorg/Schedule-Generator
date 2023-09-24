package schedule.generator;

import Handler.Place;
import Handler.Reservation;
import Handler.Schedule;
import Interface.Interface;
import Users.Professor;
import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main implements Serializable{

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        /* Prototipo no Funcional de la serialización
        String filename = "GuardadoReservas";
        
        File file = new File(filename);
        
        if (!file.exists()){
            
            Place classroom = null;
            Professor name = null;
            
            Schedule schedule = new Schedule();
            schedule.addReservation(new Reservation(LocalTime.of(2, 2),LocalTime.of(4, 4),classroom,name,"prueba"));
            
            try{
                schedule.serialize(filename);
                
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        
        Schedule loadedSchedule = Schedule.deserialize("GuardadoReservas");
        
        ArrayList<Reservation> reservations = loadedSchedule.getReservations();
        */
        Interface frame = new Interface();
        
        frame.setVisible(true);
    }
    
}
