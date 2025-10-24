/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingsw20252.Semana6.Ejercicio1.Despues;

/**
 *
 * @author ander
 */
public class PedidoTe implements Pedido {

    private Barista barista;

    public PedidoTe(Barista barista) {
        this.barista = barista;
    }

    @Override
    public void ejecutar() {
        barista.prepararTe();
    }

}
