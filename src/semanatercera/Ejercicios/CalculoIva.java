/*
 2-. Modelar una clase CalculoIva para realizar el cálculo del IVA. La clase deberá 
de tener dos métodos, el primero que calcule el IVA al precio de un artículo el cual 
deberá de recibir como parámetros el precio sin IVA y el porcentaje del IVA 
a aplicar y el segundo que reciba como parámetro el precio del articulo con IVA y el porcentaje
del IVA y que devuelva el precio del artículo sin IVA.
 */
package semanatercera.Ejercicios;

public class CalculoIva {
    private double IPArticulo;
    private double PSIva;
    private double PIva;
    
    public CalculoIva(){
         
    }
    public static void main(String[] args) {
        
        
    }

    public CalculoIva(double IPArticulo, double PIva) {
        this.IPArticulo = IPArticulo;
        this.PIva = PIva;
    }

    public double getIPArticulo() {
        return IPArticulo;
    }

    public void setIPArticulo(double IPArticulo) {
        this.IPArticulo = IPArticulo;
    }

    public double getPSIva() {
        return PSIva;
    }

    public void setPSIva(double PSIva) {
        this.PSIva = PSIva;
    }

    public double getPIva() {
        return PIva;
    }

    public void setPIva(double PIva) {
        this.PIva = PIva;
    }
    
    double calculoIva(double PA, double iva1){
        double precio = PA+(PA * iva1);
        return precio;
    }
    
    double calculoIva2(CalculoIva Iva, double iva){
        double precio1 = Iva.getPSIva();
       PIva = this.PSIva * this.PIva;
      double precio =  Iva.calculoIva(precio1, Iva.getPIva()) - PIva;
        return precio;
    }
    
    
    
}
