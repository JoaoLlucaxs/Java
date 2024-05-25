package enums.explicacao2;

import java.io.ObjectInputFilter.Status;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pedido pedido=new Pedido();
		pedido.setNomeCliente("João");
		pedido.setPedido(StatusPedido.EMITIDO); //TYPE-SAVE(Só compila o que estiver no enum), ver logo em tempo de compilação o erro
		pedido.setOrigemPedido(OrigemPedido.BALCAO);
		
		System.out.println(pedido.getPedido());
		
		System.out.println(StatusPedido.EMITIDO.ordinal()); // mostra o numero que representa esse enum
		System.out.println(StatusPedido.EMITIDO.name()); // mostra o nome dessa constante
		
		// Como saber quais constante 
		for(StatusPedido status: StatusPedido.values()) { //.values() retorna um array de todas as constantes
			System.out.printf("%d - %s%n",status.ordinal(), status.name()); //0 - EMITIDO mostra a descrição de todos e numero de localização
		}
		
		//**********************************************************************************************************
		
		// Suponha que você recebe de outro lugar um texto e tem que colocar como enum (converter) - Lembre-se se não tive na classe enum dará erro
		String textoStatus="CANCELADO";
		StatusPedido status=StatusPedido.valueOf(textoStatus); //"valueof - "valor de:"
		System.out.println(status.ordinal() +  " - " + status.name());
		
		
		//**********************************************************************************************************
		// Suponha que quer converter um ordinal 1 para um Statuspedido
		
		int numero=1;
		StatusPedido pedido2=StatusPedido.values()[numero];
		System.out.println(pedido2.ordinal() + " - " + pedido2.name());
		
	}

}
