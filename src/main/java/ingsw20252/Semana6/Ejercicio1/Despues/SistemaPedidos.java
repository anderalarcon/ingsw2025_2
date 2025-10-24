/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingsw20252.Semana6.Ejercicio1.Despues;

public class SistemaPedidos {

    Pedido pedido;

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void procesarPedido() {
        if (pedido != null) {
            pedido.ejecutar();
        } else {
            System.out.println("No hay pedido un pedido asignado");
        }
    }

}
