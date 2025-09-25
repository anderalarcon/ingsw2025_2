/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingsw20252.Semana5.Ejercicio2.Despues;

/**
 *
 * @author ander
 */
public class Main {

    public static void main(String[] args) {

        INotificacion notiemail = new NotificacionEmail();

        notiemail.enviar("CONTENIDO DEL EMAIL");

        INotificacion notiesms = new NotificacionSMS();

        notiesms.enviar("CONTENIDO DEL SMS");
        
        INotificacion notislack = new SlackAdapter(new SlackService());
        
        notislack.enviar("CONTENIDO DEL MSJ SLACK");

    }
}
