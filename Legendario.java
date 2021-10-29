
package Lab3P2_Dessire_22111211;

public class Legendario {
    private PokeLegendario pokemonLeg = new PokeLegendario();

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
