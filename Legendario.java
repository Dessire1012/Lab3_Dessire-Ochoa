
package Lab3P2_Dessire_22111211;

public class Legendario extends Entrenador{
    private PokeLegendario pokemonLeg = new PokeLegendario();

    public Legendario(String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
    }

    public Legendario() {
        super();
    }

    public PokeLegendario getPokemonLeg() {
        return pokemonLeg;
    }

    public void setPokemonLeg(PokeLegendario pokemonLeg) {
        this.pokemonLeg = pokemonLeg;
    }

    @Override
    public String toString() {
        return "Legendario{" + "pokemonLeg=" + pokemonLeg + '}';
    }

}
