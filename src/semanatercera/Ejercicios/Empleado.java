/*
 Crear la clase Empleado utilizando ENCAPSULAMIENTO con las siguientes características:
Atributos: (No Nit, Apellidos, Nombres, Dirección, Salario Devengado, Salario Con Descuento,
Bandera de Empleado Activo o Inactivo)
Métodos:

a) Crear un método para calcular el Salario con Descuento que es Salario Devengado –
b) Descuento del 10% de Renta
c) Crear un método para Imprimir el Nombre Completo del Contribuyente
d) Imprimir Todos los Atributos
e) Crear el método main para probar el funcionamiento de la clase y realizar sus pruebas.
 */
package semanatercera.Ejercicios;

public class Empleado {
    private double Nit;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private double Salario;
    private int Bandera;
    
    public Empleado() {
    }

    public Empleado(double Nit, String Nombre, String Apellido, String Direccion, double Salario, int Bandera) {
        this.Nit = Nit;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Salario = Salario;
        this.Bandera = Bandera;
    }

    public double getNit() {
        return Nit;
    }

    public void setNit(double Nit) {
        this.Nit = Nit;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public int getBandera() {
        return Bandera;
    }

    public void setBandera(int Bandera) {
        this.Bandera = Bandera;
    }
    
    public double descuentoRenta() {
        double salarioConDescuento = this.Salario - (this.Salario * 0.10);
        return salarioConDescuento;
    }

    public void bandera() {
        if(this.Bandera == 1){
            System.out.println("Activo");
        }else{
            System.out.println("Inactivo");
        }
    }

    public String informacion(Empleado A) {
        String datos = "";

        datos += "Escriba el N° de NIT :" + A.getNit() + "\n";
        datos += "Escriba el Nombre del Empleado : " + A.getNombre() + "\n";
        datos += "Escriba el Apellido del Empleado : " + A.getApellido() + "\n";
        datos += "Escriba la direccion : " + A.getDireccion() + "\n";
        datos += "El salario Devengado es : $" + A.getSalario() + "\n";
        return datos;
    }

}
