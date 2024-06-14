package coleta_lixo;

import composicao.Carro;

public class Coleta_Lixo_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro meuCarro=new Carro();
		meuCarro.setAnoDeFabricacao(2000); // at� aqui est� na m�moria HEAP
		
		meuCarro=null; // perde a refer�ncia do objeto
		
		meuCarro.setCor("Verde"); // devido a perca, vai dar NullPointer
		
		// A medida que a memoria est� acabando. Garbage collector entra em a��o
		// Existe v�rios algoritmos de coleta
		// tomar cuidado, saber configurar em ambiente de produ��o
	}

}
