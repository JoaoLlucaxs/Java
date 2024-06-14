package coleta_lixo;

import composicao.Carro;

public class Coleta_Lixo_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro meuCarro=new Carro();
		meuCarro.setAnoDeFabricacao(2000); // até aqui está na mémoria HEAP
		
		meuCarro=null; // perde a referência do objeto
		
		meuCarro.setCor("Verde"); // devido a perca, vai dar NullPointer
		
		// A medida que a memoria está acabando. Garbage collector entra em ação
		// Existe vários algoritmos de coleta
		// tomar cuidado, saber configurar em ambiente de produção
	}

}
