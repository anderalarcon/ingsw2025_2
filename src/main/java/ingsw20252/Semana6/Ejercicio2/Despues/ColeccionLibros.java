/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingsw20252.Semana6.Ejercicio2.Despues;

/**
 *
 * @author ander
 */
public class ColeccionLibros implements Coleccion {

    private String[] libros = {"Quijote", "Neruda", "300"};

    @Override
    public Iterador crearIterador() {
        return new IteradorStrings(libros);
    }

}
