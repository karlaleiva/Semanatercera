
package semanatercera;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class RegistroEstudiante {
    
    public static void main(String[] args) {
        EstudianteE est = new EstudianteE();
        
        BufferedReader leer = new  BufferedReader (new InputStreamReader(System.in));
        
        try{
            //Ingreso de los siguientes valores
            System.out.println("carnet del estudiante");
            long carnet = long.parseLong(leer.readLine());
            System.out.println("nombres del Estudiante");
            String nombres =leer.readLine();
            System.out.println("Apellido del Estudiante:");
            String apellidos = leer.readLine();
            
            est.setCarnetEstudiante(carnet);
            est.setNombreEstudiante(nombres);
            est.setApellidoEstudiante(apellidos);
            
            System.out.println("<<<Recuperando valores>>>");
            System.out.println("Carnet:" + est.getCarnetEstudiante());
            System.out.println("Nombre" + est.getNombreEstudiante());
            System.out.println("Apellido" + est.getApellidoEstudiante()); 
        }catch(Exception e){
            System.out.println();
        }
    }
}
