
package Lab3P2_Dessire_22111211;


public class Entrenador {

    private String nombre;
    private int edad;
    private char sexo;

    public Entrenador() {
    }

    public Entrenador(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
   

}
