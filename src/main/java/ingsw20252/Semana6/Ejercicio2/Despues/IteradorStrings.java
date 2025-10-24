/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingsw20252.Semana6.Ejercicio2.Despues;

/**
 *
 * @author ander
 */
public class IteradorStrings implements Iterador<String> {

    private String[] strings;
    private int posicion;

    public IteradorStrings(String[] strings) {
        this.strings = strings;
    }

    @Override
    public boolean hasNext() {
        return posicion < strings.length;
    }

    @Override
    public String next() {
        return strings[posicion++];
    }

}
