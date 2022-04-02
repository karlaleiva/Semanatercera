
package semanatercera;


public class Estudiante {
    
    long carnet;
    String nombre,apellido;
    
    public void RegistroEstudiante (){   
        System.out.println("Metodo Para Registro De Estudiante:");
    }
    
     public void ConsultarEstudiante (){ 
        System.out.println("Metodo Para Consultar De Estudiante:");
    }
     
      public void EliminarEstudiante (){
        System.out.println("Metodo Para Eliminar De Estudiante:");
    }
    public static void main(String[] args) {
        
    
    Estudiante est =new Estudiante ();
    est.carnet = 1234;
    est.nombre = "Amelia";
    est.apellido = "Rosales";
    
        System.out.println(" carnet :" + est.carnet);
        System.out.println(" nombre :" + est.nombre);
        System.out.println("apellido:" + est.apellido);
    
     }
}
