
package Lab3P2_Dessire_22111211;


public class Pokemon {
    private String nombre;
    private double ataque;
    private int vida;

    public Pokemon() {
    }

    public Pokemon(String nombre, double ataque, int vida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        if (ataque >= 100 && ataque <=200){
            this.ataque = ataque; 
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida >= 200 && vida <= 500){
            this.vida = vida;
        } 
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", ataque=" + ataque + ", vida=" + vida + '}';
    }
     
    
}
