package forLaco;

public class SomaN�merosRestri��es {
	public static void main(String[] args) {
		
		/*Soma de N�meros com Restri��es
		 * 
		 * Crie um programa que percorre os n�meros de 1 a 100 e soma apenas os n�meros �mpares.
		 *  No entanto, o programa deve seguir as seguintes regras:

			Use a instru��o continue para ignorar os n�meros pares.
			
			(N�o faz sentido j� que o 100 est� no la�o verificado ser� sempre menor ou igual 100)
			-> Use a instru��o break para parar a soma quando a soma acumulada for maior que 200.
		 * */
		
		for (int soma = 1; soma < 100; soma++) {
			if(soma % 2 == 0) { // se o resto for 0 ent�o � par ou seja o continue pula esse numero par
				continue;
			}
			soma++;
			System.out.println(soma);
		}
	}
}
