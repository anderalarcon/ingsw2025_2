/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingsw20252.Semana5.Ejercicio2.Despues;

/**
 *
 * @author ander
 */
public class SlackAdapter implements INotificacion {

    private final SlackService slack;

    public SlackAdapter(SlackService slack) {
        this.slack = slack;
    }

    @Override
    public void enviar(String mensaje) {
        slack.postMessage(mensaje);
    }

}
