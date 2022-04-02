/*
 3-. Crear la clase FormatoFecha para probar el POLIMORFISMO. La clase deberá de tener
definidos dos métodos que reciban una fecha sin guiones ni plecas en formato String.
Ejemplo 10062012. 
a) El primer método deberá de imprimir la fecha con guiones. Ejemplo: 10-06-2012.
b) El segundo método deberá de imprimir la fecha con plecas. Ejemplo: 10/06/2012
 */
package semanatercera.Ejercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class FormFecha {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat Fecha1 = new SimpleDateFormat("AAAA-MM-dd");
        SimpleDateFormat fech2 = new SimpleDateFormat("AAAA/MM/dd");
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribir la Fecha:");
        String fecha = leer.nextLine();
        
        Date fecha1 = Fecha1.parse(fecha);
        System.out.println("--------------------------------------");
        System.out.println(Fecha1.format(fecha1));
        System.out.println("-------------------------------------- ");
        
        System.out.println("Escribir  la fecha:");
        String fech = leer.nextLine();
        
        Date fecha2 = Fecha1.parse(fecha);
        System.out.println("--------------------------------------");
        System.out.println(fech2.format(fech));
        System.out.println("-------------------------------------- ");
    }
    
}
