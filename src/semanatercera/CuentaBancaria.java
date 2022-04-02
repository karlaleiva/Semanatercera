
package semanatercera;


public class CuentaBancaria {
    long numerocuenta;
    Cliente propietariocuenta;
    double saldocuenta;
    
    public void abonar ( double cantidad){
        saldocuenta += cantidad;
    }
    
     public void retirar ( double cantidad){
        if (cantidad > saldocuenta){
            System.out.println("¡saldo insuficiente!");
        }
        saldocuenta -= cantidad;
    }
    public String datospropietariocuenta() {
        String informacion="";
        informacion +="Dui:" + propietariocuenta.duicliente + "\n";
        informacion += "Nombre:" + propietariocuenta.nombrecliente;
        informacion +="Telefono:" + propietariocuenta.telefonocliente;
        return informacion;
        
    }
    
}
