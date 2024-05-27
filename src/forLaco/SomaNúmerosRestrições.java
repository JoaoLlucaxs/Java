package forLaco;

public class SomaNúmerosRestrições {
	public static void main(String[] args) {
		
		/*Soma de Números com Restrições
		 * 
		 * Crie um programa que percorre os números de 1 a 100 e soma apenas os números ímpares.
		 *  No entanto, o programa deve seguir as seguintes regras:

			Use a instrução continue para ignorar os números pares.
			
			(Não faz sentido já que o 100 está no laço verificado será sempre menor ou igual 100)
			-> Use a instrução break para parar a soma quando a soma acumulada for maior que 200.
		 * */
		
		for (int soma = 1; soma < 100; soma++) {
			if(soma % 2 == 0) { // se o resto for 0 então é par ou seja o continue pula esse numero par
				continue;
			}
			soma++;
			System.out.println(soma);
		}
	}
}
