
package semanatercera.Ejercicios;

import java.util.Scanner;


public class MainEmpleado {
    
    public static void main(String[] args) {
        String Nombre, Apellido, Direccion;
        double noNit, SalarioDevengado, SalarioDescuento;
        String Bandera = "";
        String info = "";
        double descuento = 0.0;
        Empleado empleado = new Empleado();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el numero de NIT :");
        empleado.setNit(Double.parseDouble(leer.nextLine()));
        System.out.println("Ingresar el nombre del Empleo:");
        empleado.setNombre(leer.nextLine());
        System.out.println("Ingrese el Apellido del Empleado :");
        empleado.setApellido(leer.nextLine());
        System.out.println("Direccion del Empleado :");
        empleado.setDireccion(leer.nextLine());
        System.out.println("Salario devengado : ");
        empleado.setSalario(leer.nextDouble());
        System.out.println("Escriba si el empleado esta activo o inactivo :");
        empleado.setBandera(leer.nextInt());
        
        info = empleado.informacion(empleado);
        descuento = empleado.descuentoRenta();
        
        
        System.out.println("------------------------------------");
        System.out.println(""+info);
        System.out.println("El salario con descuento de renta es : $"+ descuento);
        empleado.bandera();
       
    }
    
}
