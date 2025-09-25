/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingsw20252.Semana5.Ejercicio2.Despues;

/**
 *
 * @author ander
 */
public class NotificacionEmail implements INotificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando EMAIL: " + mensaje);

    }

}
