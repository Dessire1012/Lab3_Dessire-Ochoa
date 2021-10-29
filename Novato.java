
package Lab3P2_Dessire_22111211;

import java.util.ArrayList;


public class Novato extends Entrenador{
    private int PokeDescubiertos;
    private Pokemon pokemon1 = new Pokemon();

    public Novato() {
    }

    public Novato(int PokeDescubiertos, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.PokeDescubiertos = PokeDescubiertos;
    }

    public int getPokeDescubiertos() {
        return PokeDescubiertos;
    }

    public void setPokeDescubiertos(int PokeDescubiertos) {
        this.PokeDescubiertos = PokeDescubiertos;
    }

    public Pokemon getPokemon1() {
        return pokemon1;
    }

    public void setPokemon1(Pokemon pokemon1) {
        this.pokemon1 = pokemon1;
    }

    @Override
    public String toString() {
        return "Novato{" + "PokeDescubiertos=" + PokeDescubiertos + ", pokemon1=" + pokemon1 + '}';
    }

  
  
    
}
