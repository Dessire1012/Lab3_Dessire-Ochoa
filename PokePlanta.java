
package Lab3P2_Dessire_22111211;

public class PokePlanta extends Pokemon{
    
     public PokePlanta() {
        super();
    }

    public PokePlanta(String nombre, double ataque, int vida) {
        super(nombre, ataque, vida);
    }
    
    public double AtaqueAgua(){
       return (super.getAtaque() * 0.35);
    }
    
}
