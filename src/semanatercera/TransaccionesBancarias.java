
package semanatercera;

import java.util.Scanner;


public class TransaccionesBancarias {
    public static void main(String[] args) {
     
    CuentaBancaria cuenta  = new CuentaBancaria();
    Scanner leer = new Scanner(System.in);
    
    String duiCliente,nombrecliente;
    long telefonocliente;
    double abono, retiro;
    
        System.out.println("Escribir los datos que se solicitan a continuacion:");
        System.out.println("Nombre del Propietario");
        duiCliente = leer.nextLine();
        
        System.out.println("Numero DUI");
       nombrecliente= leer.nextLine();
       
       System.out.println("Telefono");
       telefonocliente= leer.nextLong();
       
       cuenta.propietariocuenta = new Cliente (duiCliente,nombrecliente, telefonocliente);
       
    
    System.out.println("Ingresar la cantidad a abonar");
    
    cuenta.abonar(abono=leer.nextDouble());
    
        System.out.println("Ingresar la cantidad a Retirar");
        cuenta.retirar(retiro=leer.nextDouble());
        
        System.out.println("-----------------------------");
        System.out.println("su saldo de la cuenta es:" + cuenta.saldocuenta);
        
        System.out.println("Datos del Propietario" + cuenta.datospropietariocuenta());
        
    
    }
    
     }

