/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingsw20252.Semana6.Ejercicio2.Despues;

/**
 *
 * @author ander
 */
public class Main {

    public static void main(String[] args) {
        Coleccion libros = new ColeccionLibros();

        Iterador iLibros = libros.crearIterador();
        System.out.println("asasdsadsad");
        while (iLibros.hasNext()) {
            System.out.println("Libro: " + iLibros.next());
        }
    }
}
