
package Lab3P2_Dessire_22111211;

import java.util.ArrayList;


public class Coordinador extends Entrenador{
    private ArrayList <Pokemon> pokemones = new ArrayList();

    public Coordinador() {
        super();
    }

    public Coordinador(String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

    @Override
    public String toString() {
        return "Coordinador{" + "pokemones=" + pokemones + '}';
    }
    
    

    
}
