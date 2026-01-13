package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Pedido pedidoComida = new PedidoComida(1, "Rogelio Diaz 2332");

        Pedido pedidoEncomienda = new PedidoEncomienda(2, "Av. Rodeo Amarillo 233");

        Pedido pedidoExpress = new PedidoExpress(3, "Pje. Rojas Magallanes 222");

        System.out.println("Poliformismo");
        pedidoComida.asignarRepartidor();
        System.out.println();

        pedidoEncomienda.asignarRepartidor();
        System.out.println();

        pedidoExpress.asignarRepartidor();
        System.out.println();

        System.out.println("sobrecarga");
        PedidoComida pc = new PedidoComida(4, "Carlos Magallanes 122");
        PedidoEncomienda pe = new PedidoEncomienda(5, "Av. Rodrilla Rojas 221");
        PedidoExpress px = new PedidoExpress(6, "Estupecta Ross 211");

        pc.asignarRepartidor("Elias Lagos");
        System.out.println();

        pe.asignarRepartidor("Nicolas Gonzalez");
        System.out.println();

        px.asignarRepartidor("Gabriel Smith");

    }

}



