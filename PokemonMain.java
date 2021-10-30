package Lab3P2_Dessire_22111211;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PokemonMain {

    public static void main(String[] args) {

        int opcion = 0;
        int opcion2 = 0;
        int posicion = 0;
        int posicion2 = 0;
        String nombre = "";
        String nombreE = "";
        String ciudad = "";
        int victorias = 0;
        int derrotas = 0;
        int dinero = 0;
        int edad = 0;
        char sexo = ' ';
        int vida = 0;
        int ataque = 0;
        int pokesDescu;
        Entrenador lider;

        ArrayList<Gimnasio> gyms = new ArrayList();
        ArrayList<Entrenador> listEntrenadores = new ArrayList();
        ArrayList<Pokemon> pokemones = new ArrayList();

        while (opcion != 11) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que opcion quiere realizar: \n"
                    + "1. Crear gimnasio\n"
                    + "2. Eliminar gimnasio\n"
                    + "3. Listar Gimnasios\n"
                    + "4. Modificar Gimnasios\n"
                    + "5. Agregar todos los entrenadores \n"
                    + "6. Listar Entrenadores\n"
                    + "7. Agregar Pokemones\n"
                    + "8. Listar Pokemones\n"
                    + "9. Asignar Pokemones\n"
                    + "10. Pelea\n"
                    + "11. Salir"));

            switch (opcion) {
                case 1:

                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del gimnasio: ");
                    ciudad = JOptionPane.showInputDialog("Ingrese la ciudad gimnasio: ");
                    dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dinero del gimnasio: "));
                    nombreE = JOptionPane.showInputDialog("Ingrese el nombre del Entrenador: ");
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Entrenador: "));
                    sexo = JOptionPane.showInputDialog("Ingrese el sexo del Entrenadore (f/m): ").charAt(0);

                    lider = new Entrenador(nombreE, edad, sexo);
                    listEntrenadores.add(lider);
                    gyms.add(new Gimnasio(nombre, ciudad, lider, victorias, derrotas, dinero));

                    break;

                case 2:
                    posicion = 0;

                    posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del gimnasio: "));

                    gyms.remove(posicion);

                    break;
                case 3:
                    String salida = "";
                    for (Gimnasio listar : gyms) {
                        salida += gyms.indexOf(listar) + "- " + listar + "\n";
                    }

                    JOptionPane.showMessageDialog(null, salida);

                    break;
                case 4:

                    posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del gimnasio: "));

                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del gimnasio: ");
                    gyms.get(posicion).setNombre(nombre);
                    ciudad = JOptionPane.showInputDialog("Ingrese la ciudad gimnasio: ");
                    gyms.get(posicion).setCiudad(ciudad);
                    dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dinero del gimnasio: "));
                    gyms.get(posicion).setDinero(dinero);
                    

                    break;
                case 5:

                    posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del gimnasio: "));

                    for (int i = 0; i <= 5; i++) {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que tipo de Entrenador es: \n"
                                + "1. Novato\n"
                                + "2. Maestro\n"
                                + "3. Coordinador\n"
                                + "4. Legendario\n"));

                        if (opcion == 1) {
                            pokesDescu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los pokemos descubiertos del Entrenador " + (i + 1) + " : "));
                            nombreE = JOptionPane.showInputDialog("Ingrese el nombre del Entrenador " + (i + 1) + " :");
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Entrenador " + (i + 1) + " : "));
                            sexo = JOptionPane.showInputDialog("Ingrese el sexo del Entrenador (f/m): ").charAt(0);

                            listEntrenadores.add(new Novato(pokesDescu, nombreE, edad, sexo));
                        }

                        if (opcion == 2) {

                            victorias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las victorias del Entrenador " + (i + 1) + " : "));
                            nombreE = JOptionPane.showInputDialog("Ingrese el nombre del Entrenador " + (i + 1) + " :");
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Entrenador " + (i + 1) + " : "));
                            sexo = JOptionPane.showInputDialog("Ingrese el sexo del Entrenador (f/m): ").charAt(0);

                            listEntrenadores.add(new Maestro(victorias, nombreE, edad, sexo));

                        }

                        if (opcion == 3) {

                            nombreE = JOptionPane.showInputDialog("Ingrese el nombre del Entrenador " + (i + 1) + " :");
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Entrenador " + (i + 1) + " : "));
                            sexo = JOptionPane.showInputDialog("Ingrese el sexo del Entrenador (f/m): ").charAt(0);

                            listEntrenadores.add(new Coordinador(nombreE, edad, sexo));

                        }

                        if (opcion == 4) {
                            nombreE = JOptionPane.showInputDialog("Ingrese el nombre del Entrenador " + (i + 1) + " :");
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Entrenador " + (i + 1) + " : "));
                            sexo = JOptionPane.showInputDialog("Ingrese el sexo del Entrenador (f/m): ").charAt(0);
                            listEntrenadores.add(new Legendario(nombreE, edad, sexo));

                        }

                    }
                    
                    gyms.get(posicion).setListaEntrenadores(listEntrenadores);

                    break;
                case 6:
                    String e = "";
                    posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la poscion del gimnasio :"));
 
                    for (int i = 0; i < gyms.get(posicion).getListaEntrenadores().size(); i++) {
                         e += i + "- " + gyms.get(posicion).getListaEntrenadores().get(i) + "\n";
                    }
                    
                    JOptionPane.showMessageDialog(null, e);

                    break;
                case 7:
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que tipo de Pokemon Agregar: \n"
                            + "1. Agua\n"
                            + "2. Fuego\n"
                            + "3. Planta\n"
                            + "4. Legendario\n"));

                    if (opcion == 1) {
                        nombre = JOptionPane.showInputDialog("Ingrese el nombre del Pokemon:");
                        ataque = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ataque del pokemon: "));
                        vida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la vida del pokemon: "));
                        pokemones.add(new PokeAgua(nombre, ataque, vida));
                    }

                    if (opcion == 2) {
                        nombre = JOptionPane.showInputDialog("Ingrese el nombre del Pokemon:");
                        ataque = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ataque del pokemon: "));
                        vida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la vida del pokemon: "));
                        pokemones.add(new PokeFuego(nombre, ataque, vida));
                    }

                    if (opcion == 3) {
                        nombre = JOptionPane.showInputDialog("Ingrese el nombre del Pokemon:");
                        ataque = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ataque del pokemon: "));
                        vida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la vida del pokemon: "));
                        pokemones.add(new PokePlanta(nombre, ataque, vida));
                    }

                    if (opcion == 4) {
                        nombre = JOptionPane.showInputDialog("Ingrese el nombre del Pokemon:");
                        ataque = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ataque del pokemon: "));
                        vida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la vida del pokemon: "));
                        pokemones.add(new PokeLegendario(nombre, ataque, vida));
                    }

                    break;
                case 8:
                    String salidaP = "";
                    for (Pokemon pokes : pokemones) {
                        salidaP += pokemones.indexOf(pokes) + "- " + pokes + "\n";
                    }

                    JOptionPane.showMessageDialog(null, salidaP);

                    break;
                case 9:
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que la poscion de su gimnasio: "));
                    posicion2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que la poscion de su Entrenador: "));
                    posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del pokemon:"));
                    opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que tipo de Entrenador es: \n"
                            + "1. Novato\n"
                            + "2. Maestro\n"
                            + "3. Coordinador\n"
                            + "4. Legendario\n"));

                    if (opcion2 == 1) {
                        ((Novato)gyms.get(opcion).getListaEntrenadores().get(posicion2)).setPokemon1(pokemones.get(posicion));
                        pokemones.remove(posicion);
                    }

                    if (opcion2 == 2) {
                        ((Maestro)gyms.get(opcion).getListaEntrenadores().get(posicion2)).setPokemon1(pokemones.get(posicion));
                        pokemones.remove(posicion);

                    }

                    if (opcion2 == 3) {
                        
                        ((Coordinador)gyms.get(opcion).getListaEntrenadores().get(posicion2)).addPokemon(pokemones.get(posicion));
                        pokemones.remove(posicion);

                    }

                    if (opcion2 == 4) {
                        ((Legendario)gyms.get(opcion).getListaEntrenadores().get(posicion2)).setPokemonLeg((PokeLegendario)pokemones.get(posicion));
                        pokemones.remove(posicion);
                    }

                    break;
                case 10:
                    
                    break;

            }//Fin Switch
        } //Fin While
    }
}
