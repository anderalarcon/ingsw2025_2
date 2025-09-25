
package ingsw20252.Semana6.Ejercicio2.Antes;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        String[] libros = biblioteca.getLibros();

        for (int i = 0; i < libros.length; i++) {
            System.out.println("Libro: " + libros[i]);
        }
    }
}

