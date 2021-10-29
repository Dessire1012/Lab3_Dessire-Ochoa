
package Lab3P2_Dessire_22111211;

public class PokeFuego extends Pokemon{
    
    public PokeFuego() {
        super();
    }
    
    public double AtaquePlanta(){
       return (super.getAtaque() * 0.35);
    }
    
}
