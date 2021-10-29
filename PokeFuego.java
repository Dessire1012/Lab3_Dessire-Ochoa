
package Lab3P2_Dessire_22111211;

public class PokeFuego extends Pokemon{
    
    public PokeFuego() {
        super();
    }

    public PokeFuego(String nombre, double ataque, int vida) {
        super(nombre, ataque, vida);
    }
    
    public double AtaquePlanta(){
       return (super.getAtaque() * 0.35);
    }
    
}
