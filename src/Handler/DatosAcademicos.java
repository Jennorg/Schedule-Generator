/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author chris
 */
public class DatosAcademicos {
    
    public static HashMap<String, HashMap<String, ArrayList<String>>> data = new HashMap<>();
    public static HashMap<String, HashMap<String, ArrayList<String>>> temp = new HashMap<>();

    private void BaseDeDatosAcademicos(){
        
                // Crear la estructura de datos y agregar datos de ejemplo
        HashMap<String, HashMap<String, ArrayList<String>>> data = new HashMap<>();

        // Agregar proyectos de carrera, materias y secciones
        HashMap<String, ArrayList<String>> project1Data = new HashMap<>();
        project1Data.put("Administración De Empresas", new ArrayList<>(Arrays.asList("Semestre 1", "Semestre 2","Semestre 3","Semestre 4","Semestre 5","Semestre 6")));
        project1Data.put("Materia2", new ArrayList<>(Arrays.asList("Sección3", "Sección4")));

        data.put("Proyecto1", project1Data);

        HashMap<String, ArrayList<String>> project2Data = new HashMap<>();
        project2Data.put("Materia3", new ArrayList<>(Arrays.asList("Sección5", "Sección6")));
        project2Data.put("Materia4", new ArrayList<>(Arrays.asList("Sección7", "Sección8")));

        data.put("Proyecto2", project2Data);
        
    }
    
    
}
