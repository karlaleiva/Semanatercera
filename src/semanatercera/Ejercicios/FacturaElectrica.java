/*
 Crear la clase Factura Eléctrica utilizando ENCAPSULAMIENTO con las siguientes características:
Atributos: (No Cuenta, Lectura actual del medidor, Lectura anterior del medidor, Multiplicador, Consumo Mensual, Consumo 
Diario, Valor Factura)
Métodos:
a) Crear un método para calcular el Consumo en el mes
b) Crear un método para calcular el Consumo Diario
c) Crear un método para calcular el Valor Factura
d) Imprimir Todos los Atributos
Ejemplo del cálculo:
Lectura Anterior: 2010 Lectura Actual: 3025
Multiplicador: 10 Días de facturación: 30
Consumo: (lectura actual - lectura anterior) x el multiplicador
Consumo = (3025kWh 2010kWh) * 10 = 10150kWh
Valor factura = Consumo * 0.20
e) Crear el método main para probar el funcionamiento de la clase y realizar sus pruebas.
 */
package semanatercera.Ejercicios;


public class FacturaElectrica {
    double NCuenta;
    double LActual_kwh;
    double LAMedidor_kwh;
    double multiplicador;
    double consumoM;
    double consumoD;
    double ValorF;

    public FacturaElectrica() {
    }

    public FacturaElectrica(double NCuenta, double LActual_kwh, double LAMedidor_kwh, double multiplicador, double consumoM, double consumoD, double ValorF) {
        this.NCuenta = NCuenta;
        this.LActual_kwh = LActual_kwh;
        this.LAMedidor_kwh = LAMedidor_kwh;
        this.multiplicador = multiplicador;
        this.consumoM = consumoM;
        this.consumoD = consumoD;
        this.ValorF = ValorF;
    }

    public double getNCuenta() {
        return NCuenta;
    }

    public void setNCuenta(double NCuenta) {
        this.NCuenta = NCuenta;
    }

    public double getLActual_kwh() {
        return LActual_kwh;
    }

    public void setLActual_kwh(double LActual_kwh) {
        this.LActual_kwh = LActual_kwh;
    }

    public double getLAMedidor_kwh() {
        return LAMedidor_kwh;
    }

    public void setLAMedidor_kwh(double LAMedidor_kwh) {
        this.LAMedidor_kwh = LAMedidor_kwh;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getConsumoM() {
        return consumoM;
    }

    public void setConsumoM(double consumoM) {
        this.consumoM = consumoM;
    }

    public double getConsumoD() {
        return consumoD;
    }

    public void setConsumoD(double consumoD) {
        this.consumoD = consumoD;
    }

    public double getValorF() {
        return ValorF;
    }

    public void setValorF(double ValorF) {
        this.ValorF = ValorF;
    }
public double valFactura(){
        double consumo = (this.LActual_kwh - this.LAMedidor_kwh)*this.multiplicador;
        double valorFactura = consumo * 0.20;
        return valorFactura;
    }
    
     public double consuMens(){
        double consumo = (this.LActual_kwh - this.LAMedidor_kwh)* this.multiplicador;
        double valorDeFactura = consumo * 0.20;
        double consumoM = valorDeFactura * this.consumoM;
        return consumoM;
    }
    
    }

    

