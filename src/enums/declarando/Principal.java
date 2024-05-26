package enums.declarando;

import enums.explicacao2.Pedido;
import enums.explicacao2.StatusPedido;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Continua��o da classe Pedido
		// Vamos supor que voc� queira saber quantas horas faltam para esse pedido ser entregue
		Pedido pedido=new Pedido();
		pedido.setNomeCliente("Joao");
		pedido.setValor(90.0); // passou e coloca como cancelado
		pedido.emitir(); // coloca como cancelado
		
		//System.out.println(pedido.tempoEntregaEmHoras());
		
		// Imagina que quero cancelar um pedido, concorda que n�o pr�tica informar direto StatusPedido.EMITIDO?
		// Se o pedido tiver sa�do j� para entrega n�o pode ser cancelado, irei criar sua regra de neg�cio no Pedido
		pedido.cancelar();
		System.out.println(pedido.getPedido());
	}

}
