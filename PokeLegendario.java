
package Lab3P2_Dessire_22111211;

public class PokeLegendario extends Pokemon {
    
     public PokeLegendario() {
        super();
    }
    
    public void vidaLegendario(int vidaExtra){
       if (super.getVida() == 0){
           super.setVida(vidaExtra);
       }
    }
    
}
