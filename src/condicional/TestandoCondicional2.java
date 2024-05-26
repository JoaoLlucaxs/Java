package condicional;

public class TestandoCondicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Melhorando a estrutura do código da classe "TestandoCondicional" com Boolean condicional
		
		int idade=16;
		int qtdAcompanhateMaiorDeIdade=3;
		boolean qtdAcompanhanteMaiorDeIdade=qtdAcompanhateMaiorDeIdade >= 3;
		
		//boolean -> só cabe duas condições "true" ou "false"
		
		// || pelo menos uma condição tem que ser verdadeira!
		if(idade >= 18 || qtdAcompanhanteMaiorDeIdade) {
			System.out.println("Você pode passar");
		}else {
			System.out.println("Desculpe, você não pode entrar");
		}
		
		// Um if é um boolean , pois ele retorna uma condicional verdadeira ou falsa
	}

}
