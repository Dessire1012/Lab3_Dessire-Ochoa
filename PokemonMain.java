package Lab3P2_Dessire_22111211;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PokemonMain {

    public static void main(String[] args) {

        int opcion = 0;
        int posicion = 0;
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
        Entrenador lider;

        ArrayList<Gimnasio> gyms = new ArrayList();
        ArrayList<Entrenador> listEntrenadores = new ArrayList();
        ArrayList<Pokemon> pokemones = new ArrayList();

        while (opcion != 9) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que opcion quiere realizar: \n"
                    + "1. Crear gimnasio\n"
                    + "2. Eliminar gimnasio\n"
                    + "3. Listar Gimnasios\n"
                    + "4. Modificar Gimnasios\n"
                    + "5. Agregar entrenadores \n"
                    + "6. Agregar Pokemones\n"
                    + "7. Asignar Pokemones\n"
                    + "8. Pelea\n"
                    + "9. Salir"));

            switch (opcion) {
                case 1:

                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del gimnasio: ");
                    ciudad = JOptionPane.showInputDialog("Ingrese la ciudad gimnasio: ");
                    dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dinero del gimnasio: "));
                    nombreE = JOptionPane.showInputDialog("Ingrese el nombre del Entrenador: ");
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Entrenador: "));
                    sexo = JOptionPane.showInputDialog("Ingrese el sexo del Entrenadore (f/m): ").charAt(0);

                    listEntrenadores.add(lider = new Entrenador(nombreE, edad, sexo));
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

                    for (int i = 0; i <= 6; i++) {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que tipo de Entrenador es: \n"
                                + "1. Novato\n"
                                + "2. Maestro\n"
                                + "3. Coordinador\n"
                                + "4. Legendario\n"));

                        if (opcion == 1) {
                            nombreE = JOptionPane.showInputDialog("Ingrese el nombre del Entrenador " + i + 1 + " :");
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Entrenador " + i + 1 + " : "));
                            sexo = JOptionPane.showInputDialog("Ingrese el sexo del Entrenador (f/m): ").charAt(0);

                            listEntrenadores.add(new Novato(nombre, edad, sexo));
                        }

                        if (opcion == 2) {

                            victorias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las victorias del Entrenador " + i + 1 + " : "));
                            nombreE = JOptionPane.showInputDialog("Ingrese el nombre del Entrenador " + i + 1 + " :");
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Entrenador " + i + 1 + " : "));
                            sexo = JOptionPane.showInputDialog("Ingrese el sexo del Entrenador (f/m): ").charAt(0);

                            listEntrenadores.add(new Maestro(victorias, nombre, edad, sexo));

                        }

                        if (opcion == 3) {

                            nombreE = JOptionPane.showInputDialog("Ingrese el nombre del Entrenador " + i + 1 + " :");
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Entrenador " + i + 1 + " : "));
                            sexo = JOptionPane.showInputDialog("Ingrese el sexo del Entrenador (f/m): ").charAt(0);

                            listEntrenadores.add(new Coordinador(nombre, edad, sexo));

                        }

                        if (opcion == 4) {
                            nombreE = JOptionPane.showInputDialog("Ingrese el nombre del Entrenador " + i + 1 + " :");
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Entrenador " + i + 1 + " : "));
                            sexo = JOptionPane.showInputDialog("Ingrese el sexo del Entrenador (f/m): ").charAt(0);
                            listEntrenadores.add(new Legendario(nombre, edad, sexo));

                        }

                    }
                    listEntrenadores.add(gyms.get(posicion).getLider());
                    gyms.get(posicion).setListaEntrenadores(listEntrenadores);

                    for (int i = 0; i <= listEntrenadores.size(); i++) {
                        listEntrenadores.remove(i);
                    }

                    break;
                case 6:
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que tipo de Pokemon Agregar: \n"
                            + "1. Agua\n"
                            + "2. Fuego\n"
                            + "3. Planta\n"
                            + "4. Legendario\n"));

                    if (opcion == 1) {
                        nombre = JOptionPane.showInputDialog("Ingrese el nombre del Pokemon:");
                        ataque = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ataque del pokemon: "));
                        vida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la vida del pokemon: "));
                        pokemones.add(new PokeAgua(nombre, edad, edad));
                    }

                    if (opcion == 2) {
                        nombre = JOptionPane.showInputDialog("Ingrese el nombre del Pokemon:");
                        ataque = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ataque del pokemon: "));
                        vida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la vida del pokemon: "));
                        pokemones.add(new PokeFuego(nombre, edad, edad));
                    }

                    if (opcion == 3) {
                        nombre = JOptionPane.showInputDialog("Ingrese el nombre del Pokemon:");
                        ataque = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ataque del pokemon: "));
                        vida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la vida del pokemon: "));
                        pokemones.add(new PokePlanta(nombre, edad, edad));
                    }

                    if (opcion == 4) {
                        nombre = JOptionPane.showInputDialog("Ingrese el nombre del Pokemon:");
                        ataque = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ataque del pokemon: "));
                        vida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la vida del pokemon: "));
                        pokemones.add(new PokeLegendario(nombre, edad, edad));
                    }

                    break;
                case 7:
                    break;

            }//Fin Switch
        } //Fin While
    }
}
