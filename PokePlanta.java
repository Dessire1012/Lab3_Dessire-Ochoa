
package Lab3P2_Dessire_22111211;

public class PokePlanta extends Pokemon{
    
     public PokePlanta() {
        super();
    }
    
    public double AtaqueAgua(){
       return (super.getAtaque() * 0.35);
    }
    
}
