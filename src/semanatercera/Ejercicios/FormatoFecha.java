/*
 3-. Crear la clase FormatoFecha para probar el POLIMORFISMO. La clase deberá de
tener definidos dos métodos que reciban una fecha sin guiones ni plecas en formato String. 
Ejemplo 10062012. 
a) El primer método deberá de imprimir la fecha con guiones. Ejemplo: 10-06-2012.
b) El segundo método deberá de imprimir la fecha con plecas. Ejemplo: 10/06/2012
 */
package semanatercera.Ejercicios;


public class FormatoFecha {
    String DIAS;
    String MES;
    String AÑO;
    
    public FormatoFecha() {
        
    }
    public FormatoFecha(String dias, String mes, String año) {
        this.DIAS = dias;
        this.MES = mes;
        this.AÑO = año;
    }
    
    
}
