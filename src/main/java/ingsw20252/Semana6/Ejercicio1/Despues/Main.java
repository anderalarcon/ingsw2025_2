/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingsw20252.Semana6.Ejercicio1.Despues;

/**
 *
 * @author ander
 */
public class Main {

    public static void main(String[] args) {
        Barista barista = new Barista();

        Pedido pcafe = new PedidoCafe(barista);

        SistemaPedidos sistema = new SistemaPedidos();

        sistema.setPedido(pcafe);

        sistema.procesarPedido();

        Pedido pte = new PedidoTe(barista);

        sistema.setPedido(pte);

        sistema.procesarPedido();

    }
}
