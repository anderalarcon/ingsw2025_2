package ingsw20252.Semana6.Ejercicio1.Antes;

public class Cafeteria {

    public void prepararPedido(String pedido) {
        if (pedido.equalsIgnoreCase("cafe")) {
            prepararCafe();
        } else if (pedido.equalsIgnoreCase("te")) {
            prepararTe();
        } else if (pedido.equalsIgnoreCase("chocolate")) {
            prepararChocolate();
        } else {
            System.out.println("Pedido no reconocido: " + pedido);
        }
    }

    private void prepararCafe() {
        System.out.println("Moliendo café...");
        System.out.println("Agregando agua caliente...");
        System.out.println("Sirviendo café.");
    }

    private void prepararTe() {
        System.out.println("Colocando bolsa de té...");
        System.out.println("Agregando agua caliente...");
        System.out.println("Sirviendo té.");
    }

    private void prepararChocolate() {
        System.out.println("Calentando leche...");
        System.out.println("Agregando chocolate en polvo...");
        System.out.println("Sirviendo chocolate.");
    }
}
