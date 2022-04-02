/*
 1-. Modelar una clase Casa con los atributos número de casa, numero de pasaje y nombre de la calle.
El número de la casa debe ser alfanumérico para contemplar las casas que tengan números como “27A”).
Cuando la casa se crea se asigna tanto el número de la casa, el número de pasaje y la calle. 
La clase tiene que tener definido un método para imprimir los valores 
asignados.
 */
package semanatercera.Ejercicios;


public class Casa {
    private int NCasa;
    private int NPasaje;
    private String NCalle;

    public Casa() {
        
    }

    public Casa(int NCasa, int NPasaje, String NCalle) {
        this.NCasa = NCasa;
        this.NPasaje = NPasaje;
        this.NCalle = NCalle;
    }

    public int getNCasa() {
        return NCasa;
    }

    public void setNCasa(int NCasa) {
        this.NCasa = NCasa;
    }

    public int getNPasaje() {
        return NPasaje;
    }

    public void setNPasaje(int NPasaje) {
        this.NPasaje = NPasaje;
    }

    public String getNCalle() {
        return NCalle;
    }

    public void setNCalle(String NCalle) {
        this.NCalle = NCalle;
    }
    
    String infoCasa(){
        String datos = "";
        datos +="El numero de la casa es :" + this.getNCasa() +"\n";
        datos +="El numero de pasaje es :" +this.getNPasaje() +"\n";
        datos +="El Nombre de la calle :" +this.getNCalle() +"\n";
        return datos;
    }
    
    

    
}
