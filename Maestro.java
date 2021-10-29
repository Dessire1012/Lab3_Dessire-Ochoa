
package Lab3P2_Dessire_22111211;


public class Maestro extends Entrenador{
    private int victorias;
    private Pokemon pokemon1 = new Pokemon();

    public Maestro() {
        super ();
    }

    public Maestro(int victorias, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.victorias = victorias;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public Pokemon getPokemon1() {
        return pokemon1;
    }

    public void setPokemon1(Pokemon pokemon1) {
        this.pokemon1 = pokemon1;
    }

    @Override
    public String toString() {
        return "Maestro{" + "victorias=" + victorias + ", pokemon1=" + pokemon1 + '}';
    }
    
    
    
}
