
package Lab3P2_Dessire_22111211;


public class PokeAgua extends Pokemon{

    public PokeAgua() {
        super();
    }

    public PokeAgua(String nombre, double ataque, int vida) {
        super(nombre, ataque, vida);
    }
    
    
    public double AtaqueFuego(){
       return (super.getAtaque() * 0.5);
    }
    
}
