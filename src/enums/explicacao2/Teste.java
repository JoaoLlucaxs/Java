package enums.explicacao2;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pedido pedido=new Pedido();
		pedido.setNomeCliente("Jo�o");
		pedido.setPedido(StatusPedido.EMITIDO); //TYPE-SAVE(S� compila o que estiver no enum), ver logo em tempo de compila��o o erro
		pedido.setOrigemPedido(OrigemPedido.BALCAO);
		
		System.out.println(pedido.getPedido());
		
		System.out.println(StatusPedido.EMITIDO.ordinal()); // mostra o numero que representa esse enum
		System.out.println(StatusPedido.EMITIDO.name()); // mostra o nome dessa constante
		
		// Como saber quais constante 
		for(StatusPedido status: StatusPedido.values()) { //.values() retorna um array de todas as constantes
			System.out.printf("%d - %s%n",status.ordinal(), status.name()); //0 - EMITIDO mostra a descri��o de todos e numero de localiza��o
		}
		
		//**********************************************************************************************************
		
		// Suponha que voc� recebe de outro lugar um texto e tem que colocar como enum (converter) - Lembre-se se n�o tive na classe enum dar� erro
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
