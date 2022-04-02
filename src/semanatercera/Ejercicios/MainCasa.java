
package semanatercera.Ejercicios;

import java.util.Scanner;

public class MainCasa {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String casa1 = "";
        Casa casa = new Casa();
        
        System.out.println("Escribir el numero de la casa :");
        casa.setNCasa(Integer.parseInt(leer.nextLine()));
        System.out.println("Escribir el numero del Pasaje :");
        casa.setNPasaje(Integer.parseInt(leer.nextLine()));
        System.out.println("Introdusca el nombre de la calle :");
        casa.setNCalle(leer.nextLine());
        System.out.println("--------------------------------------");
        
        casa1 = casa.infoCasa();
        
        System.out.println("" + casa);
        
    }
    
}
