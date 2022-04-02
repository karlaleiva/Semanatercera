
package semanatercera.Ejercicios;

import java.util.Scanner;


public class MainCalculoIva {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double CalcularIva1 = 0.0;
        double CalcularIva2 = 0.0;
        CalculoIva CIva = new CalculoIva();
        
        System.out.println("Escribir el Precio :");
        CIva.setPSIva(leer.nextDouble());
        System.out.println("Escribir el Iva:");
        CIva.setPIva(leer.nextDouble());
        System.out.println("-------------------------------");
        
        CalcularIva1 = CIva.calculoIva(CIva.getPSIva(),CIva.getPIva());
        CalcularIva2 = CIva.calculoIva2(CIva, CIva.getPIva());
        
        System.out.println("Precio con IVA : $"+ CalcularIva1);
        System.out.println("Precio sin IVA : $"+ CalcularIva2);
    }
    
}
