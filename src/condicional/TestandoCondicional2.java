package condicional;

public class TestandoCondicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Melhorando a estrutura do c�digo da classe "TestandoCondicional" com Boolean condicional
		
		int idade=16;
		int qtdAcompanhateMaiorDeIdade=3;
		boolean qtdAcompanhanteMaiorDeIdade=qtdAcompanhateMaiorDeIdade >= 3;
		
		//boolean -> s� cabe duas condi��es "true" ou "false"
		
		// || pelo menos uma condi��o tem que ser verdadeira!
		if(idade >= 18 || qtdAcompanhanteMaiorDeIdade) {
			System.out.println("Voc� pode passar");
		}else {
			System.out.println("Desculpe, voc� n�o pode entrar");
		}
		
		// Um if � um boolean , pois ele retorna uma condicional verdadeira ou falsa
	}

}
