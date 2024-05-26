package enums.declarando;

import enums.explicacao2.Pedido;
import enums.explicacao2.StatusPedido;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Continuação da classe Pedido
		// Vamos supor que você queira saber quantas horas faltam para esse pedido ser entregue
		Pedido pedido=new Pedido();
		pedido.setNomeCliente("Joao");
		pedido.setValor(90.0); // passou e coloca como cancelado
		pedido.emitir(); // coloca como cancelado
		
		//System.out.println(pedido.tempoEntregaEmHoras());
		
		// Imagina que quero cancelar um pedido, concorda que não prática informar direto StatusPedido.EMITIDO?
		// Se o pedido tiver saído já para entrega não pode ser cancelado, irei criar sua regra de negócio no Pedido
		pedido.cancelar();
		System.out.println(pedido.getPedido());
	}

}
