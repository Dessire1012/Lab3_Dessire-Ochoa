
package Lab3P2_Dessire_22111211;

import java.util.ArrayList;


public class Novato extends Entrenador{
    private ArrayList <Pokemon> pokeDescubiertos = new ArrayList();
    private Pokemon pokemon1 = new Pokemon();

    public Novato() {
        super();
    }

    public Novato(String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
    }

    public ArrayList<Pokemon> getPokeDescubiertos() {
        return pokeDescubiertos;
    }

    public void setPokeDescubiertos(ArrayList<Pokemon> pokeDescubiertos) {
        this.pokeDescubiertos = pokeDescubiertos;
    }

    public Pokemon getPokemon1() {
        return pokemon1;
    }

    public void setPokemon1(Pokemon pokemon1) {
        this.pokemon1 = pokemon1;
    }

    @Override
    public String toString() {
        return "Novato{" + "pokeDescubiertos=" + pokeDescubiertos + ", pokemon1=" + pokemon1 + '}';
    }
    
    
  
    
}
