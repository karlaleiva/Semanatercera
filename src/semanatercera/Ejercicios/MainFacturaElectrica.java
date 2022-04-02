
package semanatercera.Ejercicios;

import java.util.Scanner;


public class MainFacturaElectrica {
    public static void main(String[] args) {
        double Factura1 = 0.0;
        double Factura2 = 0.0;
        
        FacturaElectrica factura = new FacturaElectrica();
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribir la cantidad de los dias a facturar :");
        factura.setConsumoM(leer.nextDouble());
        System.out.println("Escribir el consumo actual en kwh :");
        factura.setLActual_kwh(leer.nextDouble());
        System.out.println("Escribir el consumo anterior en kwh :");
        factura.setLAMedidor_kwh(leer.nextDouble());
        System.out.println("La cantidad del multiplicador es :");
        factura.setMultiplicador(leer.nextDouble());
        
        System.out.println("-------------------------------------------");
        Factura1 = factura.valFactura();
        Factura2 = factura.consuMens();
        System.out.println(""+ Factura1);
        System.out.println(""+ Factura2);
        
    }
}
