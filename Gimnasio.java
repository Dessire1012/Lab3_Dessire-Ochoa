
package Lab3P2_Dessire_22111211;

import java.util.ArrayList;

public class Gimnasio {
    private String nombre;
    private String ciudad;
    private Entrenador lider;
    private int victorias;
    private int derrotas;
    private int dinero;
    private ArrayList <Entrenador> listaEntrenadores = new ArrayList();


    public Gimnasio() {
    }

    public Gimnasio(String nombre, String ciudad, Entrenador lider, int victorias, int derrotas, int dinero) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.lider = lider;
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.dinero = dinero;
    }

    public Entrenador getLider() {
        return lider;
    }

    public void setLider(Entrenador lider) {
        this.lider = lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        if(dinero % 10000 == 0){
            this.dinero = dinero;
        }
    }
    
    public ArrayList<Entrenador> getListaEntrenadores() {
        return listaEntrenadores;
    }

    public void setListaEntrenadores(ArrayList<Entrenador> listaEntrenadores) {
        if(listaEntrenadores.size() <= 7){
            this.listaEntrenadores = listaEntrenadores;
        }  
    }

    @Override
    public String toString() {
        return "Gimnasio{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", victorias=" + victorias + ", derrotas=" + derrotas + ", dinero=" + dinero + '}';
    }
    
}

