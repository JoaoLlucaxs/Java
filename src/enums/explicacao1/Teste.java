package enums.explicacao1;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pedido pedido=new Pedido(1, new Date(), OrderStatus.ENTREGUE);
		
		System.out.println(pedido);
	
	}

}
