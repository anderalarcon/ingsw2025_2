
package ingsw20252.Semana5.Ejercicio2.Antes;

public class Main {

    public static void main(String[] args) {
        NotificacionEmail email = new NotificacionEmail();
        email.enviarEmail("Hola por correo!");
        
        NotificacionSMS sms = new NotificacionSMS();
        sms.enviarSMS("Hola por SMS!");
        
        SlackService slack = new SlackService();
        slack.postMessage("Hola por Slack!");
    }
}
